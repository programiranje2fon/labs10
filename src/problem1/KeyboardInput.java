package problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {
	
	static String readString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		return s;
	}

	static double readNumberAndReturnSquare() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a real number: ");
		String s = br.readLine();
		double d = Double.parseDouble(s);
		return (d * d);
	}

	static boolean readNumberAndCheckEven() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter an integer: ");
		
		String s = br.readLine();
		int i = Integer.parseInt(s);
		if (i % 2 == 0)
			return true;
		else
			return false;
		
	}

	static int readSentenceAndReturnWordCount() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a sentence: ");
		String s = br.readLine();
		String[] words = s.split(" ");
		return words.length;
	}

}
