package A03.test;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import org.junit.Test;
import A02.Point;
import A02.Rectangle;

public class RectangleTest {

	Point p = new Point(10.0, 5.0);
	Rectangle r = new Rectangle(p, 5, 5);

	@Test
	public void getPerimeterTest() {

		double perimeter = r.getPerimeter();
		DecimalFormat df = new DecimalFormat("#.##");
		String aString = df.format(perimeter);
		double aDouble = Double.parseDouble(aString);
		if (aDouble == 20.0)
			assertTrue(true);
		else
			assertTrue(false);
	}

	@Test
	public void getSurfaceTest() {
		double surface = r.getSurface();
		DecimalFormat df = new DecimalFormat("#.##");
		String aString = df.format(surface);
		double aDouble = Double.parseDouble(aString);
		if (aDouble == 25.0)
			assertTrue(true);
		else
			assertTrue(false);
	}
	
}
