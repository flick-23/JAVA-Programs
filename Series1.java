/*WAP to give to sum of the following series...
1  1  1   1
-  - +- + -............n 
1! 2! 3!  4!
*/
import java.io.*;
import java.lang.*;
class Series1
{
	
	public static double fact(int  num)
	{
		int fac=1,j;
		for(j=1;j<=num;j++)
		{
			fac=fac*j;
		}
		
		return(fac);
	}
	
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		double sum=0,f=0;
		int n,i;
		
		System.out.println("\nEnter the range of the Series to be calculated :");
		n=Integer.parseInt(venki.readLine());
		
		Series1 obj=new Series1();
		
		for(i=1;i<n;i++)
		{
			f=obj.fact(i);
			sum=sum+(1/f);
		}
		System.out.println("\nSum : "+sum);

	}
}

