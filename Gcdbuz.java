import java.io.*;
import java.lang.*;
class Gcdbuz
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int choice,a,b,t; 
		
		System.out.println("\nPress 1 if you want GCD of a number OR Press 2 to check for a BUZZ number !");
		choice=Integer.parseInt(venki.readLine());
		
		switch(choice)
		{
			case 1: System.out.println("\nEnter the Number's :");
					a=Integer.parseInt(venki.readLine());
					b=Integer.parseInt(venki.readLine());
					while(a%b!=0)
					{
						t=a%b;
						a=b;
						b=t;
					}
					System.out.println("\nThe GCD of the Numbers is :"+b);
			break;
			case 2: System.out.println("\nEnter the Number to be Checked!");
					int num=Integer.parseInt(venki.readLine());
					if(num%7==0||num%10==7)
					{
						System.out.println("\nIt is a BUZZ Number!");
					}
					else 
					{
						System.out.println("\nIT is not a BUZZ number!!!");
					}
			break;
			default: System.out.println("\nWRONG CHOICE!");
		}
	}
}