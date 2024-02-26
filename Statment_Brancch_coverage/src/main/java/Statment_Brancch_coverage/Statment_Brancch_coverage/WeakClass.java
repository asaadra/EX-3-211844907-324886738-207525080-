package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {



	public static int weakMethod1(int x,int y) {
		int z;
		if((x==5)||(y==0)){
			z=x/y;
		}
		else {
			z=x+y;
		}
		return z;
	}


	public static int weakMethod2(int x,int y) {
		int z;

		if((x==5)){
			System.out.println("this");
			z=x/y;
		}
		else
			z=x-y;
		return z;
	}

	public static int weakMethod3(int x,int y) {
		int z;
		if((x==5)||(y==0)){
			z=x/y;
		}
		else {
			z=x+y;
		}
		return z;

	}

	public static int weakMethod4(int x,int y) {
		int z;

		if((x==3)){
			z=x/y;
		}
		else
			z=x-y;
		return z;
	}


}