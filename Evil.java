import java.io.*;
import java.lang.*;
class Evil
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int num,bin=0,temp=0,rem;
		
		System.out.println("\nEnter a Number to be Converted in Binary form:");
		num=Integer.parseInt(venki.readLine());
		System.out.println("\nBinary Form of Entered Number is :");
		while(num!=0)
		{
			rem=num%2;
			bin=bin+rem;
			num=num/2;
			System.out.print(rem);
		}
		System.out.println("\n\nChecking The Number.......");
		if(bin%2==0)
		{
			System.out.println("\nThe Entered Number in Binary Form is EVIL!");
		}
		else 
		{
			System.out.println("\nThe Entered Number in Binary Form is not EVIL!");
		}			
	}
}