
public class PowerDigitSum {

	public static void main(String[] args) {
		  int n = 2;
	      int power = 1000;
	      int sum = 0;
	      int x= (int)Math.pow(n, power);
	        while (x!=0)
	        {
	            int d=x%10;
	            sum=sum+d;
	            x=x/10;
	        }
          System.out.println(sum);
	}
}