import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Right Triangle and extends Polygon.
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangle extends Polygon
{

    /**
     * Triangle constructor.
     * 
     * @param pointRightAngle The vertex of the right triangle that has the right angle.
     * @param base The width of the base.  Positive widths correspond to 2nd vertex being to the right
     *               of this vertex; negative widths correspond to the 2nd vertex being to the left.
     * @param height The height at the apex of the triangle.  Positive heights correspond to the vertex 
     *               being placed below the base; negative heights correspond to the vertex being
     *               placed above the base.
     * @param color Desired color of the triangle.
     * @param filled Whether or not the triangle should be filled.
     */
    public RightTriangle(Point pointRightAngle, int base, int height, Color color, boolean filled)
    {
    	// Super constructor from polygon
        super(color, filled);
        // Sets initial corner of the triangle
        this.location = new Point[3];
        location[0] = pointRightAngle;
        //Checks horizontal orientation of the triangle
        if (base > 0)
        {
        	//Sets bottom left corner
        	location[1] = new Point(pointRightAngle.x - base, pointRightAngle.y);
        	
        	//Checks vertical orientation of the triangle
        	if (height > 0)
        	{
        		//Sets top
        		location[2] = new Point(pointRightAngle.x - base, pointRightAngle.y - height);
        	}
        	
        	else
        	{
        		//Sets top
        		location[2] = new Point(pointRightAngle.x - base, pointRightAngle.y + height);
        	}
        }
        else
        {
        	//Sets bottom left corner
        	location[1] = new Point(pointRightAngle.x + base, pointRightAngle.y);
        	
        	//Checks vertical orientation of the triangle
        	if (height > 0)
        	{
        		//Sets top
        		location[2] = new Point(pointRightAngle.x - base, pointRightAngle.y - height);
        	}
        	
        	else
        	{
        		//Sets top
        		location[2] = new Point(pointRightAngle.x - base, pointRightAngle.y + height);
        	}
        }
    }
}
