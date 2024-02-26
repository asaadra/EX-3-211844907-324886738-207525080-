package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EX3_a {
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
}
