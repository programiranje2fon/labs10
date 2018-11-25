package problem2;

public class KeyboardInputCheck2 {
	
	public static void main(String[] args) {
		String s = KeyboardInput2.readAndReturnString();
		System.out.println(s);
		
		double square = KeyboardInput2.readNumberAndReturnSquare();
		System.out.println(square);
		
		boolean even = KeyboardInput2.readNumberAndCheckEven();
		System.out.println(even);
	}
	
}