import java.awt.Color;
import java.awt.Point;
/**
 * Shape class
 * @author connor
 *
 */
public abstract class Shape implements Drawable
{
	//Sets generic color, filled, and location array
	protected Point[] location = new Point[1000];
	private Color color;
	private boolean filled;
	
	/**
	 * Shape constructor 
	 * @param color Color of object
	 * @param filled Is object filled
	 */
	public Shape(Color color, boolean filled)
	{
		//Sets color and filled
		this.color = color;
		this. filled = filled;
	}
	
	/**
	 * Method to retrun the color
	 * @return returns the color
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Method to return if the object is filled
	 * @return returns filled or empty
	 */
	public boolean isFilled()
	{
		return filled;
	}
	
	/**
	 * Method to return the location array
	 * @return returns the location array
	 */
	public Point[] getLocation()
	{
		return location;
	}

}
