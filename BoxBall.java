
/**
 * Write a description of class BoxBall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.awt.Color;
import java.awt.geom.*;
public class BoxBall
{
    private Canvas myCanvas = new Canvas("BoxBall", 700, 700);
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void CreateBoxBall() {
       
        myCanvas.setVisible(true);
        Random oRand = new Random();
        Color ballColor = new Color(oRand.nextInt(255), oRand.nextInt(255), oRand.nextInt(255));
        myCanvas.drawLine(50, 400, 550, 400);
        myCanvas.drawLine(50, 50, 550, 50);
        myCanvas.drawLine(50, 400, 50, 50);
        myCanvas.drawLine(550, 400, 550, 50);
        int ballDiameter = oRand.nextInt(20) + 10;
        int top = 50;
        int left = 50;
        String xD = "right";
        String yD = "down";
        
        BouncingBall oBall1 = new BouncingBall(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
        oBall1.draw();
        
        ballDiameter = oRand.nextInt(20) + 10;
        BouncingBall oBall2 = new BouncingBall(oRand.nextInt(550) + 50, oRand.nextInt(400) + 50, ballDiameter, ballColor, (400 - ballDiameter), top, (550 - ballDiameter), left, yD, xD, myCanvas);
        oBall2.draw();
        
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            oBall1.move();
            oBall2.move();
            // stop once ball has travelled a certain distance on x axis
        }
    }
}
