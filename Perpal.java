import java.io.*;
import java.lang.*;
class Perpal
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int choice,temp,n,rev=0,r,s=0;
		
		System.out.println("\nPress 1 to Check for Palindrome Number and 2 For Perfect Number!");
		choice=Integer.parseInt(venki.readLine());
		
		switch(choice)
		{
			case 1: System.out.println("\nEnter a Number:");
					n=Integer.parseInt(venki.readLine());
					temp=n;
					while(n!=0)
					{
						r=n%10;
						rev=rev*10+r;
						n=n/10;
					}
					System.out.println("\nReverse of the Given Number is:"+rev);
					if(rev==temp)
						System.out.println("\nIt is a Palindrome Number");
					else 
						System.out.println("\nIt is not a Palindrome Number");
			break;
			case 2: System.out.println("\nEnter a Number:");
					n=Integer.parseInt(venki.readLine());
					for(int i=1;i<n;i++)
					{
						if(n%i==0)
						{
							s+=i;
						}
					}
						if(s==n)
						{
							System.out.println("\nIt is a Perfect Number !");
						}
						else 
						{
							System.out.println("\nIt is not A Perfect Number!!");
						}
					
			break;
			default:System.out.println("\nWRONG CHOICE!");
		}
	}
}