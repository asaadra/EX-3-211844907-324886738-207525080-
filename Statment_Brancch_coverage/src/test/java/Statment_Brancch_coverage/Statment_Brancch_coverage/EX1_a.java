package Statment_Brancch_coverage.Statment_Brancch_coverage;


import org.junit.Test;

public class EX1_a {

	
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void testWeakMethod1PartialCoverage() {
		
		int x=5;
		int y=0;
		WeakClass.weakMethod1(x,y);
	}

	
	
	


}
