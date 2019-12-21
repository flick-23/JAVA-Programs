import java.io.*;
import java.lang.*;
class Evesum
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		long n;
		long r=0,s=0,s1=0;
		System.out.println("\nEnter a Number :");
		n=Integer.parseInt(venki.readLine());
		long t=n;
		while(n!=0)
		{
			r=n%10;
			if(r%2==0)
			{
				s=s+r;
			}
			if(r%2!=0)
			{
				s1=s1+r;
			}
			n=n/10;
		}
		
		System.out.println("\nThe Sum of Even Numbers in "+t+" is : " +s);
		System.out.println();
		System.out.println("\nThe Sum of Odd  Numbers in "+t+" is : " +s1);
	}
}