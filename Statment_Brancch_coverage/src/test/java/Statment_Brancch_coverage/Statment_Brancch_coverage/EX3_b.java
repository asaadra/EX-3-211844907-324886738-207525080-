package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EX3_b {
	@Test
	public void testWeakMethod1fullCoverage1() {
		int x=5;
		int y=1;
		int expectedResult=5/1;
		int result = WeakClass.weakMethod3(x,y);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testWeakMethod1fullCoverage2() {
		int x=4;
		int y=1;
		int expectedResult=5;
		int result = WeakClass.weakMethod3(x,y);
		assertEquals(expectedResult, result);
	}
	
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void testWeakMethod1fullCoverage3() {
		int x=5;
		int y=0;
		WeakClass.weakMethod3(x,y);
	}
	@Test(expected = java.lang.ArithmeticException.class)
	public void testWeakMethod1fullCoverage4() {
		int x=4;
		int y=0;
		WeakClass.weakMethod3(x,y);
	}
}
