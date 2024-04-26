package sit707_week6;

public class WeatherAndMathUtils {
	public static final double DANGEROUS_WINDSPEED = 70.0;
	public static final double DANGEROUS_RAINFALL = 6.0;
	public static final double CONCERNING_WINDSPEED = 45.0;
	public static final double CONCERNING_RAINFALL = 4.0;

	/**
	 * Advises weather alert based on wind-speed and precipitation.
	 * 
	 * 
	 * @param windSpeed
	 * @param precipitation
	 * @return
	 */
	public static String weatherAdvice(double windSpeed, double precipitation) {
	    if (precipitation > 6.0 || windSpeed > 70.0) {
            return "Dangerous Level Alert";
        } else if (precipitation > 4.0 && windSpeed > 45.0) {
            return "Dangerous Level Alert";
        } else if (windSpeed > 45.0 || precipitation > 4.0) {
            return "Warning Level Alert";
        } 
	    
		String advice = "All-Clear Alert";

		if (windSpeed > DANGEROUS_WINDSPEED || precipitation > DANGEROUS_RAINFALL
				|| (windSpeed > CONCERNING_WINDSPEED && precipitation > CONCERNING_RAINFALL)) {
			advice = "CANCEL";
		} else if (windSpeed > CONCERNING_WINDSPEED || precipitation > CONCERNING_RAINFALL) {
			advice = "WARN";
		}

		return advice;
	}

	/**
	 * Calculates if a number is even.
	 * 
	 * @param a
	 * @return
	 */
	 public static boolean isEven(int num) {
	        return num % 2 == 0;
	    }
	    

	/**
	 * Calculates if a number is prime.
	 * 
	 * @param n
	 * @return
	 */
	 public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 // Function with a conditional loop (for loop) and simple instructions
	    public static int sumNumbers(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    // Function with a conditional loop (while loop) and a conditional statement in the loop body
	    public static int countEvenNumbers(int[] numbers) {
	        int count = 0;
	        int index = 0;
	        while (index < numbers.length) {
	            if (numbers[index] % 2 == 0) {
	                count++;
	            }
	            index++;
	        }
	        return count;
	    }
}
