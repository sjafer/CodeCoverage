package application;

public class MathLibraryApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MathLibrary math = new MathLibrary();
		
		System.out.println("|num| = "+ math.absoluteValue(-1));
	}

}
