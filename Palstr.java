import java.io.*;
import java.lang.*;
class Palstr
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String str,str1="";
		str=venki.readLine();
		int l=str.length();
		
		for(int i=l-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str1.equalsIgnoreCase(str))
		{
			System.out.println("\nThe Entered String is PALINDROME!");
		}
		else
		{
			System.out.println("\nThe Entered is NOT Palindrome!");
		}
	}
}