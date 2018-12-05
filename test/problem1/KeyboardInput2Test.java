package problem1;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import problem1.KeyboardInput2;

public class KeyboardInput2Test {

	public final String SOME_INPUT_STRING = "some simulated input string";
	
	@Test
	public void method_readString() {
		ByteArrayInputStream in = new ByteArrayInputStream(SOME_INPUT_STRING.getBytes());
		InputStream sysIn = System.in;
		System.setIn(in);

		String ucitanString = KeyboardInput2.readAndReturnString();
		assertTrue("Metoda ne ucitava i vraca string ", ucitanString.trim().equalsIgnoreCase(SOME_INPUT_STRING));

		System.setIn(sysIn);
	}

	@Test
	public void method_readNumberReturnSquare() {
		ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
		InputStream sysIn = System.in;
		System.setIn(in);

		double kvadrat = KeyboardInput2.readNumberAndReturnSquare();
		assertTrue("Metoda ucitajBrojIVratiKvadrat ne ucitava i ispisuje dobro kvadrat", (kvadrat == 25));

		System.setIn(sysIn);	
	}

	@Test
	public void method_readNumberAndCheckEven() {
		ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
		InputStream sysIn = System.in;
		System.setIn(in);

		boolean paran = KeyboardInput2.readNumberAndCheckEven();
		assertTrue("Metoda ucitajBrojIProveriParnost ne ucitava i ne proverava dobro parnost za parne brojeve",
				(paran == true));

		in = new ByteArrayInputStream("5".getBytes());
		System.setIn(in);

		paran = KeyboardInput2.readNumberAndCheckEven();
		assertTrue("Metoda ucitajBrojIProveriParnost ne ucitava i ne proverava dobro parnost za neparne brojeve",
				(paran == false));

		System.setIn(sysIn);		
	}



}
