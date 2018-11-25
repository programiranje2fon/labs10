package problem1;

import java.io.IOException;

public class KeyboardInputCheck {
	
	public static void main(String[] args) {
		
		
		try {
			String s = KeyboardInput.readString();
			System.out.println(s);
		} catch (IOException e) {
			System.out.println("String reading error!");
		}
		
		
		try {
			double d = KeyboardInput.readNumberAndReturnSquare();
			System.out.println(d);
		} catch (IOException e) {
			System.out.println("Number reading error.");
		} catch(NumberFormatException nex) {
			System.out.println("Number has not been entered!");
		}
		
		
		try {
			boolean even = KeyboardInput.readNumberAndCheckEven();
			
			if (even) System.out.println("Number is not even.");
				else System.out.println("Number is odd.");
		} catch (IOException e) {
			System.out.println("Number reading error.");
		} catch(NumberFormatException nex) {
			System.out.println("Number has not been entered!");
		}
		
		
		try {
			int wordCount = KeyboardInput.readSentenceAndReturnWordCount();
			System.out.println("Word count: "+wordCount);
		} catch (IOException e) {
			System.out.println("Sentence reading error.");
		}
	}

}
