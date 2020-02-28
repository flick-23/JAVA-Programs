import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class  KOL15A
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
			String s=venki.next();
			int i,j,c=0;
			for(i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch>='0' && ch<='9')
				{
					int x=(int)ch-48;
					c+=x;
				}
			}
			System.out.println(c);
		}
	}
}