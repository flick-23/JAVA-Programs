import java.io.*;
import java.lang.*;
class INGEN01
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int t=venki.readLine();
		for(int T=0;T<t;T++)
		{
			int k=Integer.parseInt(venki.readLine());
			String s=venki.readLine();
			String S="";int i,ch;
			for(i=0;i<s.length();i++)
			{
				ch=(int)s.charAT(i);
				ch=ch-12;
				if(ch<65)
				{
					ch=(90-(65-ch))+1;
				}
				char chr=(char)ch;
				S+=""+chr;
			}
			for(i=0;i<S.length();i++)
			{
				try
				{
					if(S.charAt(i)=='Q' && S.charAt(i+1)=='Q')
					{
						System.out.print(" ");
						i++;
					}
					else
					{
						System.out.print(S.charAt(i));
					}
				}
			}
		}	
	}
}