package application;
public class MathLibrary {
	/**
	 * This method will return the absolute value for the given number.
	 * 
	 * @param number
	 *            This is an integer number.
	 * @return This is the absolute value for the given number.
	 */
	public int absoluteValue(int number) {
		int returnValue;
		if (number == Integer.MIN_VALUE) {
			// The number is too small to be represented in a positive form.
			// Simply return 0.
			returnValue = 0;

		} else if (number >= 0) {
			returnValue = number;
		} else {
			returnValue = 0 - number;
		}
		return returnValue;
	}

}
