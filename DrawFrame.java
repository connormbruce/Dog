
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
        RightTriangle leftEar = new RightTriangle(new Point(315,150), 30, 150, Color.MAGENTA, true);
        RightTriangle rightEar = new RightTriangle(new Point(515,150), 30, 150, Color.MAGENTA, true);
        
        // Eyes:
        Circle leftEye = new Circle(new Point(300,225), 50, Color.BLUE, true);
        Circle rightEye = new Circle(new Point(500,225), 50, Color.GREEN, true);
        Circle dot1 = new Circle(new Point(300,225), 10, Color.WHITE, true);
        Circle dot2 = new Circle(new Point(500,225), 10, Color.WHITE, true);
        
        // Nose and Whiskers:
        Circle nose = new Circle (new Point(400,325), 100, Color.BLACK, true);
        Circle dot3 = new Circle(new Point(375,325), 20, Color.WHITE, true);
        Circle dot4 = new Circle(new Point(425,325), 20, Color.WHITE, true);
        
        PolyLine Whisker1 = new PolyLine(new Point(400,225), new Point(300,325), 5, Color.WHITE, true);
        
        // Collar:
        
        // Square around the dog:

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
        
        // set background color
        drawPanel.setBackground(Color.WHITE);
        
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
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
