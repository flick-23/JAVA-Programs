import java.io.*;
import java.lang.*;
class Alphaorder
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		String sen;
		int len;
		char c;
		
		System.out.println("\nEnter a String to be Printed in Alphabetical Order !");
		sen=venki.readLine();
		len=sen.length();
		for(int i=65;i<95;i++)
		{
			for(int j=0;j<len;j++)
			{
				c=sen.charAt(j);
				if(c==(char)i||c==(char)(i+32))
					System.out.print(c);
			}
		}
		
	}
}