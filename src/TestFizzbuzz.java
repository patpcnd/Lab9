import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzbuzz {

	@Test
	void test() {
		Fizzbuzz fizzbuzz = new Fizzbuzz();
		int input = fizzbuzz.printStringinput(1);
		assertEquals(1, input);
	}

}