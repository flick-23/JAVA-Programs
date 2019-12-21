import java.io.*;
import java.lang.*;
class Reversestr
{
	private static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		String wor,wor1="";
		int a,i;
		char chr,chr1=0;		
		
		System.out.println("\nEnter A Sentence (Without using Space) :");
		wor=venki.readLine();
		a=wor.length();
		for(i=0;i<a;i++)
		{
			chr=wor.charAt(i);
			if(chr>='A'&&chr<='Z')
			{
				chr1=Character.toLowerCase(chr);
				wor1+=chr1;
			}
			else if(chr>='a'&&chr<='z')
			{
				chr1=Character.toUpperCase(chr);
				wor1+=chr1;
			}
			else
			{
				wor1+=chr1;
			}
		}
		System.out.println("\nINVERTING..................!");
		System.out.println("\n "+wor1);
	}
}