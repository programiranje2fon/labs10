package problem1;

import java.io.IOException;

public class KeyboardInputCheck {

	public static void main(String[] args) {
		
		try {
			String s = KeyboardInput.readString();
			System.out.println("You've just entered:\n" + s);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			double square = KeyboardInput.readNumberAndReturnSquare();
			System.out.println("The returned value is: " + square);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		
		try {
			boolean isEven = KeyboardInput.readNumberAndCheckEven();
			if (isEven) System.out.println("The input number is even");
			else System.out.println("The input number is odd");
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		
		try {
			System.out.println("Number of words in the input is: " + 
								KeyboardInput.readSentenceAndReturnWordCount());
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
