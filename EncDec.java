import java.io.*;
import java.lang.*;
class EncDec
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		char ch,chr=0;
		int l,i,c=0;
		
		System.out.println("\nEnter a Word : ");
		str=venki.readLine();
		l=str.length();
		System.out.println("\nEncrypting the String by  : 2 (letters)");
		System.out.println("\nEncrypted String : ");
		for(i=0;i<l;i++)
		{
			ch=str.charAt(i);
			if((ch>='a'&&ch<='x') || (ch>='A'&&ch<='X'))
			{
				c=(int)(ch+2);
			}
			if((ch>='y'&&ch<='z') || (ch>='Y'&&ch<='Z'))
			{
				c=(int)(ch-24);
			}
			chr=(char)(c);
			System.out.print(chr);
		}
			System.out.println();
		
		System.out.println("\nDecrypting  the String by  : 2 (letters)");
		System.out.println("\nDecrypting String : ");
		for(i=0;i<l;i++)
		{
			ch=str.charAt(i);
			if((ch>='c'&&ch<='z') || (ch>='C'&&ch<='Z'))
			{
				c=(int)(ch-2);
			}
			if((ch>='a'&&ch<='b') || (ch>='A'&&ch<='B'))
			{
				c=(int)(ch+24);
			}
			chr=(char)(c);
			System.out.print(chr);
		}
			System.out.println();
	}
}