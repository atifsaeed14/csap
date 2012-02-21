package A03.test;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import org.junit.Test;
import A02.Point;
import A03.Triangle;

public class TriangleTest {

	Point P1 = new Point(10, 5);
	Point P2 = new Point(25, 5);
	Point P3 = new Point(25, -5);
	Triangle t = new Triangle(P1, P2, P3);

	@Test
	public void getPerimeterTest() {

		double perimeter = t.getPerimeter();
		DecimalFormat df = new DecimalFormat("#.##");
		String aString = df.format(perimeter);
		double aDouble = Double.parseDouble(aString);
		if (aDouble == 43.03)
			assertTrue(true);
		else
			assertTrue(false);
	}

	@Test
	public void getSurfaceTest() {
		double surface = t.getSurface();
		DecimalFormat df = new DecimalFormat("#.##");
		String aString = df.format(surface);
		double aDouble = Double.parseDouble(aString);
		if (aDouble == 75.0)
			assertTrue(true);
		else
			assertTrue(false);
	}

}
