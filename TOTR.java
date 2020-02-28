import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.Scanner;
class TOTR
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		String S=venki.next();
		char Leng[]=new char[26],Byte[]=new char[26],Heng[]=new char[26];
		int i,j=0,l;
		for(i=97;i<=122;i++)
		{
			Leng[j]=(char)i;
			j++;
		}
		System.out.println();
		j=0;
		for(i=65;i<=90;i++)
		{
			Heng[j]=(char)i;
			j++;
		}	
		System.out.println();
		for(i=0;i<S.length();i++)
		{
			Byte[i]=S.charAt(i);
		}	
		System.out.println();	
		for(int T=0;T<t;T++)
		{
			String M=venki.next();
			for(i=0;i<M.length();i++)
			{	
				char ch=M.charAt(i);
				if(ch>='a' && ch<='z')
				{
					for(j=0;j<26;j++)
					{
						if(ch==Leng[j])
						{
							System.out.print(Byte[j]);
						}
					}
				}
				else if(ch>='A' && ch<='Z')
				{
					for(j=0;j<26;j++)
					{
						if(ch==Heng[j])
						{
							int x=Byte[j]-32;
							char chr=(char)x;
							System.out.print(chr);
						}
					}
				}
				else if(ch=='_')
				{
					System.out.print(" ");
				}
				else
					System.out.print(ch);
			}
			System.out.println();
		}
	}
}