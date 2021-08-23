import java.util.*;
public class Multiplesof3and5 {

	public static void main(String[] args) {
		System.out.println("Enter a number below 1000");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
	 	   {
	 		 if(i%3==0||i%5==0)
		      {
			    sum=sum+i;
		      }
	 	   }
		System.out.println("sum is "+sum);

	}

}
