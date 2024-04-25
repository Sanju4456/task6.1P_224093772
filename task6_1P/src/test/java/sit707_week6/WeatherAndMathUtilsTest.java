package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "YourStudentID"; // Replace with your student ID
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "YourName"; // Replace with your name
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(3)); // 3 is not even
	}
	
    @Test
    public void testDangerousWeatherAdvice() {
    	Assert.assertEquals("Dangerous Level Alert", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    // Add more test cases to improve coverage
    
    @Test
    public void testPrecipitationAboveThreshold() {
        Assert.assertEquals("Warning Level Alert", WeatherAndMathUtils.weatherAdvice(30.0, 5.0));
    }
    
    @Test
    public void testWindSpeedAboveThreshold() {
        Assert.assertEquals("Warning Level Alert", WeatherAndMathUtils.weatherAdvice(50.0, 2.0));
    }

    @Test
    public void testSumNumbers() {
        Assert.assertEquals(15, WeatherAndMathUtils.sumNumbers(5)); // Sum of first 5 natural numbers
    }
    
    @Test
    public void testCountEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertEquals(5, WeatherAndMathUtils.countEvenNumbers(numbers)); // Count of even numbers in the array
    }
    @Test
    public void testDangerousRainfall() {
        Assert.assertEquals("Dangerous Level Alert", WeatherAndMathUtils.weatherAdvice(30.0, 7.0)); // More than 6 inches of rainfall
    }
    
    @Test
    public void testDangerousWindspeed() {
        Assert.assertEquals("Dangerous Level Alert", WeatherAndMathUtils.weatherAdvice(80.0, 2.0)); // Windspeed greater than 70 mph
    }
    
    @Test
    public void testConcerningRainfallAndWindspeed() {
        Assert.assertEquals("Dangerous Level Alert", WeatherAndMathUtils.weatherAdvice(50.0, 5.0)); // More than 4 inches of rainfall and windspeed greater than 45 mph
    }
    
    @Test
    public void testWarningRainfall() {
        Assert.assertEquals("Warning Level Alert", WeatherAndMathUtils.weatherAdvice(30.0, 5.0)); // Windspeed below 45 mph but more than 4 inches of rainfall
    }
    
    @Test
    public void testWarningWindspeed() {
        Assert.assertEquals("Warning Level Alert", WeatherAndMathUtils.weatherAdvice(50.0, 2.0)); // Rainfall below 4 inches but windspeed greater than 45 mph
    }
    

    }


