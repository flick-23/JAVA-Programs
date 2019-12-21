import java.io.*;
import java.lang.*;
class Prime
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int num,i,flag=0;
		
		System.out.println("\nEnter the Number to be Checked for Prime Number :");
		num=Integer.parseInt(venki.readLine());
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("\nIt is a Composite Number !");
		}
		else 
			System.out.println("\nIt is a Prime Number !");
	}
}