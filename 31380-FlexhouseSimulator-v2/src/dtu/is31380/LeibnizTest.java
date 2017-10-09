package dtu.is31380;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeibnizTest {

	@Test
	public void test() {
		// assertEquals(3.14, Leibniz.pi(1000));
		double d = Leibniz.pi(1000);
		System.out.printf("The pi calculation is %f%n", d);
		assertEquals(3.14, d, 0.005);
	}
}
