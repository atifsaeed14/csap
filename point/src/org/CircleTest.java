package A03.test;

import static org.junit.Assert.assertTrue;
import java.text.DecimalFormat;
import org.junit.Test;
import A02.Point;
import A03.Circle;

public class CircleTest {
	Point p = new Point(10.0, 5.0);
	Circle c = new Circle(p, 3.0);

	@Test
	public void getPerimeterTest() {

		double perimeter = c.getPerimeter();
		DecimalFormat df = new DecimalFormat("#.##");
		String aString = df.format(perimeter);
		double aDouble = Double.parseDouble(aString);
		if (aDouble == 18.85)
			assertTrue(true);
		else
			assertTrue(false);
	}

	@Test
	public void getSurfaceTest() {
		double surface = c.getSurface();
		DecimalFormat df = new DecimalFormat("#.##");
		String aString = df.format(surface);
		double aDouble = Double.parseDouble(aString);
		if (aDouble == 28.27)
			assertTrue(true);
		else
			assertTrue(false);
	}

}
