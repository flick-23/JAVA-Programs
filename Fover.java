//WAP For Function Overloading (Pg - 75)
/* 1.void num_cal(int num,char ch) it computes square of an integer if choice ch is 's' or it computes cube
   2.void num_cal(int a,int b,char ch) it computes the product of a & b if choice ch is 'p' or it adds
   3.void num_cal(String str1,String str2) it checks if 2 strings are equal
*/
import java.io.*;
import java.lang.*;
class Fover
{
	int sc,pa;

	void num_cal(int num,char ch)
	{
		if(ch=='s')
		{
			sc=num*num;
		}
		else
		{
			sc=num*num*num;
		}
		System.out.println(sc);
	}
	void num_cal(int a, int b, char cH)
	{
		if(cH=='p') 
		{
			pa=a*b;
		}
		else
		{
			pa=a+b;
		}
		System.out.println(pa);
	}
	void num_cal(String str1, String str2)
	{
		if(str1.equals(str2))
		{
			System.out.println("\nThe Entered Strings Match");
		}
		else
		{
			System.out.println("\nThe Entered Strings Do Not Match!");
		}
	}
	
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int  Num,A,B;
		String STR1,STR2;
		char CH,Ch;
		
		System.out.println("\nEnter a Number : ");
		Num=Integer.parseInt(venki.readLine());
		System.out.println("\nPress 's' to square it OR Press 'c' to Cube it!");
		CH=(char)venki.read();
		
		System.out.println("\nEnter Two Values :");
		A=Integer.parseInt(venki.readLine());
		B=Integer.parseInt(venki.readLine());
		System.out.println("\nPress 'p' to multiply them OR Press 'a' to Add them!");
		Ch=(char)venki.read();
		
		System.out.println("\nEnter 2 Strings to be Compared :");
		STR1=venki.readLine();
		STR2=venki.readLine();
		
		Fover ob=new Fover();
		ob.num_cal(Num,CH);
		ob.num_cal(A,B,Ch);
		ob.num_cal(STR1,STR2);
	}
}