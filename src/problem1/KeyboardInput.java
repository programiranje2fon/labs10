package problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardInput {
	
	public static String readString() throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter some text to test if the keyboard is working:");
		return in.readLine();
		
	}
	
	public static double readNumberAndReturnSquare() throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter a real number:");
		String numStr = in.readLine();
		double num;
		try {
			num = Double.parseDouble(numStr);
			return Math.pow(num, 2);
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			return -1;
		}
			
	}
	
	
	public static boolean readNumberAndCheckEven() throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		boolean done = false;
		boolean isEven = false;
		while(!done) {
			try {
				System.out.println("Please enter an integer:");
				String numStr = in.readLine();
				int num = Integer.parseInt(numStr);
				done = true;
				isEven = num % 2 == 0;
			} catch (NumberFormatException e) {
				System.out.println("The provided entry is not an integer. Please try again");
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Please try again");
			}
		}
		return isEven;
		
	}
	
	
	public static int readSentenceAndReturnWordCount() throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter some text");
		String text = in.readLine();
		return text.split(" ").length;
		
	}

	
}
