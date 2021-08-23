
public class _1000thfibonaccinumber {
	public static long Fibonaccinumber(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return Fibonaccinumber(n-1)+Fibonaccinumber(n-2);
	}

	public static void main(String[] args) {
		
	    System.out.println( Fibonaccinumber(1000));

	}

}
