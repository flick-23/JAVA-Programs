import java.io.*;
import java.lang.*;
class Acro
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String str;
		int l,c=0,i,acr=0;
		
		System.out.println("\nEnter a Sentence :");
		str=venki.readLine();
		l=str.length();
		for(i=0;i<l;i++)
		{
			char sen=(str.charAt(i));
			if(Character.isUpperCase(sen))
			{
				acr+=1;
			}
		}
		System.out.println("\n"+acr);
	}
}