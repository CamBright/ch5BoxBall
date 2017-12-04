import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

/**
 * Class BouncingBall - a graphical ball that observes the effect of gravity. The ball
 * has the ability to move. Details of movement are determined by the ball itself. It
 * will fall downwards, accelerating with time due to the effect of gravity, and bounce
 * upward again when hitting the ground.
 *
 * This movement can be initiated by repeated calls to the "move" method.
 * 
 * @author Michael Kölling (mik)
 * @author David J. Barnes
 * @author Bruce Quig
 *
 * @version 2011.07.31
 */

public class BoxBounce
{
    private static final int GRAVITY = 3;  // effect of gravity

    private int ballDegradation = 2;
    private Ellipse2D.Double circle;
    private Color color;
    private int diameter;
    private int xPosition;
    private int yPosition;
    private final int groundPosition; 
    private final int topPosition;
    private final int rightPosition;
    private final int leftPosition;
    private int xDirection;
    private int yDirection;// y position of ground
    private Canvas myCanvas;
    private int ySpeed = 1;                // initial downward speed

    /**
     * Constructor for objects of class BouncingBall
     *
     * @param xPos  the horizontal coordinate of the ball
     * @param yPos  the vertical coordinate of the ball
     * @param ballDiameter  the diameter (in pixels) of the ball
     * @param ballColor  the color of the ball
     * @param groundPos  the position of the ground (where the wall will bounce)
     * @param drawingCanvas  the canvas to draw this ball on
     */
    public BoxBounce(int xPos, int yPos, int ballDiameter, Color ballColor,
                        int ground, int top, int right, int left, int yD, int xD, Canvas drawingCanvas)
    {
        xPosition = xPos;
        yPosition = yPos;
        color = ballColor;
        diameter = ballDiameter;
        groundPosition = ground;
        topPosition = top;
        rightPosition = right;
        leftPosition = left;
        xDirection = xD;
        yDirection = yD;
        myCanvas = drawingCanvas;
    }

    /**
     * Draw this ball at its current position onto the canvas.
     **/
    public void draw()
    {
        myCanvas.setForegroundColor(color);
        myCanvas.fillCircle(xPosition, yPosition, diameter);
    }

    /**
     * Erase this ball at its current position.
     **/
    public void erase()
    {
        myCanvas.eraseCircle(xPosition, yPosition, diameter);
    }    

    /**
     * Move this ball according to its position and speed and redraw.
     **/
    public void move()
    {
        Random oRand = new Random();
        // remove from canvas at the current position
        erase();
        myCanvas.setVisible(true);
        myCanvas.drawLine(50, 400, 550, 400);
        myCanvas.drawLine(50, 50, 550, 50);
        myCanvas.drawLine(50, 400, 50, 50);
        myCanvas.drawLine(550, 400, 550, 50);
        // compute new position
        if(yDirection == 0 && xDirection == 0) {
            yPosition += oRand.nextInt(3)+1;
            xPosition += oRand.nextInt(3)+1;
        } else if(yDirection == 0 && xDirection == 1) {
            yPosition += oRand.nextInt(3)+1;
            xPosition -= oRand.nextInt(3)+1;
        } else if(yDirection == 1 && xDirection == 0) {
            yPosition -= oRand.nextInt(3)+1;
            xPosition += oRand.nextInt(3)+1;
        } else if(yDirection == 1 && xDirection == 1) {
            yPosition -= oRand.nextInt(3)+1;
            xPosition -= oRand.nextInt(3)+1;
        }

        // check if it has hit the ground
        if(yPosition >= groundPosition) {
            yPosition = (int)(groundPosition);
            yDirection = 1; 
        } else if(yPosition <= topPosition) {
            yPosition = (int) (topPosition);
            yDirection = 0;
        } else if(xPosition >= rightPosition) {
            xPosition = (int) (rightPosition);
            xDirection = 1;
        } else if(xPosition <= leftPosition) {
            xPosition = (int) (leftPosition);
            xDirection = 0;
        }

        // draw again at new position
        draw();
    }    

    /**
     * return the horizontal position of this ball
     */
    public int getXPosition()
    {
        return xPosition;
    }

    /**
     * return the vertical position of this ball
     */
    public int getYPosition()
    {
        return yPosition;
    }
}
