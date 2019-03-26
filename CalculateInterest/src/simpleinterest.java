import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class simpleinterest {

	@Test
	void test() {
		CalculateInterest test = new CalculateInterest();
		double output = test.simpleinterest(10000, 5, 5);
		assertEquals(2500,output);
	}

}
