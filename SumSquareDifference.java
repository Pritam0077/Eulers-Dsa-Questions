
public class SumSquareDifference {

	public static void main(String[] args) {
		    int sum1 = 0, sum2 = 0, difference = 0;
           
	        for (int i = 1; i <= 100; i++) {
	            sum1 =sum1+i;
	            sum2=sum2 + (int)Math.pow(i, 2);
	        }
	                
	        difference = (int)Math.pow(sum1, 2) - sum2;
	        System.out.println(difference);

	}

}
