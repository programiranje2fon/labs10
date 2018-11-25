package problem2;

import java.util.Scanner;

public class KeyboardInput2 {
	
	static String readAndReturnString() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a message: ");
		String text = s.nextLine();
		return text;
	}

	static double readNumberAndReturnSquare() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a real number: ");
		double d = s.nextDouble();
		return (d * d);
	}

	static boolean readNumberAndCheckEven() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int i = s.nextInt();
	
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

}