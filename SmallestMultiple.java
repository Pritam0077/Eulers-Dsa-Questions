
public class SmallestMultiple {

	public static void main(String[] args) {
		boolean a=true;
		int result=0;
		
		for(int x=2520;a;x++)
		{
			if(x%11!=0||x%12!=0||x%13!=0||x%14!=0||x%15!=0||x%16!=0||x%17!=0||x%18!=0||x%19!=0||x%20!=0)
				continue;
			else
			  result=x;
			  a=false;
		}
        System.out.println(result);
	}

}
