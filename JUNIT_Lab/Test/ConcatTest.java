package Test;

import static org.junit.Assert.*;

import org.junit.Test;


public class ConcatTest {
	@Test
	public void test() {
	Juint j = new Juint();
	String result = j.concat("one","two");
	assertEquals("onetwo",result);

	}
}