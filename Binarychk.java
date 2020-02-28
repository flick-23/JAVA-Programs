import java.io.*;
class Binarychk
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		long num,rem=0;
		System.out.println("\nEnter a number : ");
		num=Long.parseLong(venki.readLine());
		long n=num;		//to make a copy of the given number 
		int l=0,flag=0;
		while(num!=0)	//to check the number of digits
		{
			rem=num%10;
			num=num/10;
			l++;
		}
		rem=0;
		for(int i=0;i<l;i++)	//to individually check the digits
		{
			rem=n%10;
			n=n/10;
			if((rem==0)||(rem==1))
			{
				flag=1;
			}
			else
			{	flag=-1;
			}
			if(flag==-1)
				break;
		}
		if(flag==1)
			System.out.println("\nThe Number is Binary ! ");
		else
			System.out.println("\nThe Number is NOT BINARY!");
	}
}
