import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void test1() {
		assertEquals(2, PrimeNumber.PrimeNumberMethod(1));
	}
	public void test2() {
		assertEquals(3, PrimeNumber.PrimeNumberMethod(2));
	}
	public void test3() {
		assertEquals(5, PrimeNumber.PrimeNumberMethod(3));
	}
	public void test4() {
		assertEquals(7, PrimeNumber.PrimeNumberMethod(4));
	}

}
