
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);
        
        // Ears:
        RightTriangle leftEar = new RightTriangle(new Point(315,150), 30, 90, Color.MAGENTA, true);
        RightTriangle rightEar = new RightTriangle(new Point(515,150), 30, 90, Color.MAGENTA, true);
        
        // Eyes:
        Circle leftEye = new Circle(new Point(300,225), 50, Color.BLUE, true);
        Circle rightEye = new Circle(new Point(500,225), 50, Color.GREEN, true);
        Circle dot1 = new Circle(new Point(300,225), 10, Color.WHITE, true);
        Circle dot2 = new Circle(new Point(500,225), 10, Color.WHITE, true);
        
        // Nose, Whiskers, mouth:
        Circle nose = new Circle (new Point(400,325), 100, Color.BLACK, true);
        Circle dot3 = new Circle(new Point(375,325), 20, Color.WHITE, true);
        Circle dot4 = new Circle(new Point(425,325), 20, Color.WHITE, true);
        
        PolyLine whisker1 = new PolyLine(new Point(325,325), new Point(350,325), 1, Color.WHITE, true);
        PolyLine whisker2 = new PolyLine(new Point(450,325), new Point(475,325), 1, Color.WHITE, true);
        
        PolyLine whisker3 = new PolyLine(new Point(330,275), new Point(360,300), 1, Color.WHITE, true);
        PolyLine whisker4 = new PolyLine(new Point(440,300), new Point(465,275), 1, Color.WHITE, true);
        
        PolyLine whisker5 = new PolyLine(new Point(330,375), new Point(360,350), 1, Color.WHITE, true);
        PolyLine whisker6 = new PolyLine(new Point(440,350), new Point(465,375), 1, Color.WHITE, true);
        
        PolyLine mouthLeft = new PolyLine(new Point(300,400), new Point(400,380), 50, Color.BLACK, true);
        PolyLine mouthRight = new PolyLine(new Point(400,380), new Point(500,400), 50, Color.BLACK, true);
        
        // Collar:
        Oval drool = new Oval(new Point(400,500), 400, 50, Color.RED, true);
        
        // Square and Circle around the dog:
        Rectangle box = new Rectangle(new Point(400, 300), 300, 500, Color.WHITE, false);
        Circle circle = new Circle(new Point(400, 300), 800, Color.WHITE, false);
        
        //Spit
        Circle spit1 = new Circle(new Point(450,450), 75, Color.RED, true);
        Circle spit2 = new Circle(new Point(425,400), 25, Color.RED, true);
        
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(leftEye);
        drawPanel.addShape(rightEye);
        drawPanel.addShape(dot1); 
        drawPanel.addShape(dot2);
        drawPanel.addShape(leftEar);
        drawPanel.addShape(rightEar);
        drawPanel.addShape(nose);
        drawPanel.addShape(dot3);
        drawPanel.addShape(dot4);
        drawPanel.addShape(whisker1);
        drawPanel.addShape(whisker2);
        drawPanel.addShape(whisker3);
        drawPanel.addShape(whisker4);
        drawPanel.addShape(whisker5);
        drawPanel.addShape(whisker6);
        drawPanel.addShape(box);
        drawPanel.addShape(drool);
        drawPanel.addShape(mouthLeft);
        drawPanel.addShape(mouthRight);
        drawPanel.addShape(spit1);
        drawPanel.addShape(spit2);
        drawPanel.addShape(circle);
        
        // set background color
        drawPanel.setBackground(Color.DARK_GRAY);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("I killed the WebCat");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
