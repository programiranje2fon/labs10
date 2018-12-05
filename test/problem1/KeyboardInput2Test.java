package problem1;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KeyboardInput2Test {

	public final String SOME_INPUT_STRING = "some simulated input string";
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final InputStream originalIn = System.in;

	
	@Before
	public void setUp() throws Exception {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(originalOut);
		System.setIn(originalIn);	
	}	
	
	@Test
	public void method_readString() {
		ByteArrayInputStream in = new ByteArrayInputStream(SOME_INPUT_STRING.getBytes());
		System.setIn(in);

		String ucitanString = KeyboardInput2.readAndReturnString();
		assertTrue("Metoda ne ucitava i vraca string ", ucitanString.trim().equalsIgnoreCase(SOME_INPUT_STRING));
	}

	@Test
	public void method_readNumberReturnSquare() {
		ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
		System.setIn(in);

		double kvadrat = KeyboardInput2.readNumberAndReturnSquare();
		assertTrue("Metoda ucitajBrojIVratiKvadrat ne ucitava i ispisuje dobro kvadrat", (kvadrat == 25));
	}

	@Test
	public void method_readNumberAndCheckEven_even() {
		ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
		System.setIn(in);

		boolean paran = KeyboardInput2.readNumberAndCheckEven();
		assertTrue("Metoda ucitajBrojIProveriParnost ne ucitava i ne proverava dobro parnost za parne brojeve",
				(paran == true));
	}
	
	@Test
	public void method_readNumberAndCheckEven_odd() {
		ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
		System.setIn(in);

		boolean paran = KeyboardInput2.readNumberAndCheckEven();
		assertTrue("Metoda ucitajBrojIProveriParnost ne ucitava i ne proverava dobro parnost za neparne brojeve",
				(paran == false));

	}

}
