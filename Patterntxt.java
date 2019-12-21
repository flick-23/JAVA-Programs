//Pg 250
import java.io.*;
import java.lang.*;
class Patterntxt
{
	void polygon(int n,char ch)
	{
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	void polygon(int x,int y)
	{
		System.out.println();
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.print('@');
			}
			System.out.println();
		}
	}
	void polygon()
	{
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		Patterntxt obj = new Patterntxt();
		
		System.out.println("Enter the value of N :");
		int N=Integer.parseInt(venki.readLine());
		System.out.println("Enter a Character : ");
		char CH=(char)venki.read();
		obj.polygon(N,CH);
		obj.polygon(5,10);
		obj.polygon();
	}
}