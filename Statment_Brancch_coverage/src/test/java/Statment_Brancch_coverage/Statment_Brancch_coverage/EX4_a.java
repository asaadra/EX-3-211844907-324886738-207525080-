package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EX4_a {
	@Test
	public void testWeakMethod1fullCoverage1() {
		int x=3;
		int y=1;
		int expectedResult=3;
		int result = WeakClass.weakMethod4(x,y);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testWeakMethod1fullCoverage2() {
		int x=4;
		int y=1;
		int expectedResult=3;
		int result = WeakClass.weakMethod4(x,y);
		assertEquals(expectedResult, result);
	}
}
