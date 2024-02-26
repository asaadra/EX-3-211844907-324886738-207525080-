package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EX_5 {




	@Test
	public void testcheckOut1() {
		double cart=2000;
		int creditRating=1;
		String statuts = "gold"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);
		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut2() {
		double cart=4000;
		int creditRating=700;
		String statuts = "gold"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}@Test
	public void testcheckOut3() {
		double cart=4000;
		int creditRating=500;
		String statuts = "gold"; 
		boolean expectedResult=false;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testcheckOut4() {
		double cart=2000;
		int creditRating=1;
		String statuts = "silver"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut5() {
		double cart=3000;
		int creditRating=800;
		String statuts = "silver"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut6() {
		double cart=3000;
		int creditRating=600;
		String statuts = "silver"; 
		boolean expectedResult=false;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut7() {
		double cart=1000;
		int creditRating=1;
		String statuts = "anyone"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut8() {
		double cart=2000;
		int creditRating=900;
		String statuts = "anyone"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testcheckOut9() {
		double cart=2000;
		int creditRating=700;
		String statuts = "anyone"; 
		boolean expectedResult=false;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
}
