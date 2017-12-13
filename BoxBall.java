
/**
 * The class BoxBall creates multiple balls with random atributes such as direction, 
 * placement and color. Ite starts by creating a canvas which the balls can
 * be displayed on and then it passes the balls onto box bounce class which helps
 * the balls move around the canvas created.
 *
 * @author Cameron Brightwell
 * @version 2017
 */
import java.util.Random;
import java.awt.Color;
import java.awt.geom.*;
import java.util.ArrayList;
public class BoxBall
{
    private Canvas myCanvas;
    /**
     * Create a canvas
     */
    public BoxBall() {
        this.myCanvas = new Canvas("BoxBall", 700, 700);
    }
    /**
     * Create balls with random positions, size, and colors as well as. 
     * limitations on where and how they bounce.
     * Move the balls.
     */
    public void CreateBoxBall() {
        
        // randomize integers for the balls properties.
        Random oRand = new Random();
        int ballDiameter = oRand.nextInt(20) + 10;
        int top = 50;
        int left = 50;
        int xD = oRand.nextInt(2);
        int yD = oRand.nextInt(2);
      
        // Create balls with randomized atributes, speed, and direction.
        Color ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall1 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall2 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall3 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall4 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall5 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall6 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall7 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall8 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall9 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall10 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall11 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall12 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall13 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall14 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall15 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall16 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
     
        ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        ballDiameter = oRand.nextInt(20) + 10;
        BoxBounce oBall17 = new BoxBounce(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
        
        boolean finished =  false;
        
            while(!finished) {
            myCanvas.wait(50);           // small delay
            oBall1.move();              // move balls
            oBall2.move();
            oBall3.move();
            oBall4.move();
            oBall5.move();
            oBall6.move();
            oBall7.move();
            oBall8.move();
            oBall9.move();
            oBall10.move();
            oBall11.move();
            oBall12.move();
            oBall13.move();
            oBall14.move();
            oBall15.move();
            oBall16.move();
            oBall7.move();
        }
    }
}
