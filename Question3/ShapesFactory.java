package Question3;
import java.util.ArrayList;
import java.util.List;
public class ShapesFactory {
	ArrayList<Shape> slist = new ArrayList<>();


	public void addShape(Shape s)
	{
	      slist.add(s);
	}
	public List<Circle> getCircles()
	{
		return null;
	    // Should return list of Circle Objects from slist property.
	}
	public List<Rectangle> getRectangles()
	{
		return null;
	    // Should return list of  Rectangle Objects from slist property.
	}
	public boolean  deleteShape(Shape s)
	{
		 if(slist.contains(s))
                  {
                     slist.remove(slist.indexOf(s)); 
                  }
                  return slist.contains(s);
	}
	
	}
