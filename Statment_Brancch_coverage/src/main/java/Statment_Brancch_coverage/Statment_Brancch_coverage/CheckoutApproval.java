package Statment_Brancch_coverage.Statment_Brancch_coverage;


public class CheckoutApproval {

	public static boolean checkOut(double cart, int creditRating,String  statuts) {
		boolean approved=false;

		if(statuts.equals("gold")) {
			if(cart<3500.00)
				approved=true;
			else
				if(creditRating>650)
					approved=true;
		}
		else
		{
			if(statuts.equals("silver"))
			{
				if(cart<2500.00)
					approved=true;
				else
					if(creditRating>750)
						approved=true;
			}
			else
			{
				if(cart<1500.00)
					approved=true;
				else
					if(creditRating>800)
						approved=true;
			}

		}
		return approved;
	}
}
