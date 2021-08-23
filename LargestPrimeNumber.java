
public class LargestPrimeNumber {

	public static void main(String[] args) {
		int max = -1;
		  for (int i = 999; i >= 100; i--)
	        {
	            for (int j = i; j >= 100; j--)
	            {

	                int product = i * j;
	                if (product < max)
	                    break;
	                int number = product;
	                int reverse = 0;
	                while (number != 0)
	                {
	                    reverse = reverse * 10 + number % 10;
	                    number /= 10;
	                }
	                if (product == reverse && product > max)
	                    max = product;
	            }
	        }
	       System.out.println(max);
	    }	

	}

