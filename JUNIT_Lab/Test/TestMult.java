package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMult {

	@Test
	public void test() {

		Juint test = new Juint();
		int res = test.multiply(10,20);
		assertEquals(res,200);
	}

}
