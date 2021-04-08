package com.qa.day5;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

class TemperatureConverterTest {

	private static TemperatureConverter convert;
	private static int test;

	@BeforeClass // set up the test environment
	public static void setup() {
		System.out.println("Before class");
		convert = new TemperatureConverter();
		test = 100;
	}

	@Test
	public void testFahrenheitToCelsius() {
		float expectedResult = (float) 37.77;
		float result = convert.convertFahrenheitToCelsius(test);

		assertEquals(expectedResult, result, 0.0f);
	}

	@Test
	public void testCelsiusToFahrenheit() {
		float expectedResult = (float) 212;
		float result = convert.convertCelsiusToFahrenheit(test);

		assertEquals("Success", expectedResult, result,0.0f);
	}

	@Test
	public void testKelvinToCelsius() {
		float expectedResult = (float) -173;
		float result = convert.convertKelvinToCelsius(test);

		assertEquals("Success",expectedResult, result,0.0f);
	}

	@Test
	public void testCelsiusToKelvin() {
		float expectedResult = (float) 373;
		float result = convert.convertCelsiusToKelvin(test);

		assertEquals("Success",expectedResult, result,0.0f);
	}

	@Test
	public void testKelvinToFahrenheit() {
		float expectedResult = (float) -279.4;
		float result = convert.convertKelvinToFahrenheit(test);

		assertEquals("Success", expectedResult, result, 0.0f);
	}

	@Test
	public void testFahrenheitToKelvin() {
		float expectedResult = (float) 310.7;
		float result = convert.convertFahrenheitToKelvin(test);

		assertEquals("Success",expectedResult, result,0.0f);
	}

//	@Test
//	public void fToCAndKToCTest() {
//		float fi = 212;
//		float ki = 373.15;
//		float fToC = convert.convertFahrenheitToCelsius(fi);
//		float kToC = convert.convertKelvinToCelsius(ki);
//
//		assertTrue(fToC == kToC);
//
//	}

}
