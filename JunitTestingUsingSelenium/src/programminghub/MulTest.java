package programminghub;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void testMul() {
		JunitClass junit = new JunitClass();
		int result = junit.mul(300,200);
		assertEquals(60000 , result);
	}

}
