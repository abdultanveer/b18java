package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int expectedOutput = 40;
		int actualOutput = Calculator.add(10, 20);
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testEncodeString() {
		String expected = "g2kk4yv4qkc!321!!";
		String actual = Calculator.encodeString("Hello World!123!!");
		assertEquals(expected, actual);
	}

}
