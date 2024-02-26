package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EX2_b {
	
	
	@Test
	public void testWeakMethod1fullCoverage1() {
		int x=5;
		int y=1;
		int expectedResult=5/1;
		int result = WeakClass.weakMethod2(x,y);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testWeakMethod1fullCoverage2() {
		int x=4;
		int y=0;
		int expectedResult=4;
		int result = WeakClass.weakMethod2(x,y);
		assertEquals(expectedResult, result);
	}

	
	
	
}
