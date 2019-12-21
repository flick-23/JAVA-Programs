/*WAP to Enter a 3 digit number and check weather it is a even or odd number...! && 
  && Display the numbers Square & Cube.........................................!*/
import java.io.*;
import java.lang.*;
class Evemidc
{
	public static void main (String[]args ) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		int n=0,n1=0;
		System.out.println("\nEnter a 3 digit number :");
		num=Integer.parseInt(venki.readLine());
		
		n=num/10;
		n1=n%10;
		
		if(n1%2==0)
			System.out.println("\nThe Middle Number is Even !");
		else 
			System.out.println("\nThe Middle Number Odd!");
		
		int sq=n1*n1; int cb=n1*n1*n1;
		System.out.println("\nMIDDLE NUMBER!");
		System.out.println("\nSquare : "+sq);
		System.out.println("\nCube   : "+cb);
	}
}