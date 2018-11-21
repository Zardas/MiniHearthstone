package utils;

public class RandomInt {
	
	public static int rand(int max, int min) {
		double number = Math.random()*(max-min);
		number = number - number%1;
		
		return (int)number;
	}
}
