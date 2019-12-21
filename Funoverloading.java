import java.io.*;
import java.lang.*;
class Funoverloading
{
	
	
	static void num_cal(int num,char ch)
	{
		if(ch=='s')
		{
			System.out.println("\nThe Square of the Number is :"+(num*num));
		}
		else
		{
			System.out.println("\nThe Cube of Number is : "+(num*num*num));
		}
	}
	
	static void num_cal(int a,int b,char ch)
	{
		if(ch=='p')
		{
			System.out.println("\nProduct of A & B : "+(a*b));
		}
		else
		{
			System.out.println("\nSum of A & B : "+(a+b));
		}
	}
	
	static void num_cal(String str1,String str2)
	{
		if(str1.equals(str2))
		{
			System.out.println("\nThe String's Match!!!");
		}
		else 
		{
			System.out.println("\nThe Strings Don't Match!!!");
		}
	}
	
	public static void main (String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int num,a,b;
		char ch;
		String str1,str2;
		
		System.out.println("\nPress 's' if you want to Square a number OR Press 'c' if you want to Cube it!");
		ch=(char)venki.read();
		System.out.println("\nEnter the value of Number :");
		num=Integer.parseInt(venki.readLine());
		char square=num_cal(ch);
		
		System.out.println("\nEnter the Value of A & B Respectively :  ");
		a=Integer.parseInt(venki.readLine());
		b=Integer.parseInt(venki.readLine());
		System.out.println("\nPress 'p' if you want the Product of A & B OR Press 'a' if you the SUm!");
		char pro=num_cal(ch);
		
		System.out.println("\nEnter the String 1 : ");
		str1=venki.readLine();
		System.out.println("\nEnter the String 2 :");
		str2=venki.readLine();
		String hell=num_cal(str1,str2);
	}
}