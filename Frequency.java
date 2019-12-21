// To Display Frequency of the Alphabets in an Order 
import java.io.*;
class Frequency
{
	public static void main(String[]args)throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader venki=new BufferedReader(read);
		
		int i,j,p,c=0;
		String str;
		char ch=0;
		
		System.out.println("\nEnter a String in Lower Case:");
		str=venki.readLine();
		p=str.length();
		System.out.println("\nThe Frequency of The alphabets in order are:");
		System.out.println("\nAlphabets : Frequency");
		for(i=97;i<=122;i++)
		{	
			c=0;ch=0;
			for(j=0;j<p;j++)
			{
				ch=str.charAt(j);
				if(ch==(char)i)
				c=c+1;
			}
			if(c!=0)
			System.out.println((char)i+"   "+c);
		}
	}
}