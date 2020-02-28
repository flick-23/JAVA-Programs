import java.io.*;
import java.lang.*;
import java.util.*;
class DISTCODE
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		for(int t=0;t<T;t++)
		{
			String S=venki.readLine();
			int i,j=1,k,l=S.length(),c=0;
			String s="";
			String a[]=new String[100000];
			a[0]=""+S.charAt(0)+S.charAt(1);
			c=1;
			for(i=1;i<l;i++)
			{
				int flag=0;
				s=s+S.charAt(i);
				if(s.length()==2)
				{
					for(k=0;k<j;k++)
					{
						if(s.equals(a[k]))
						{
							flag=1;
						}
					}
					if(flag!=1)
					{
						a[c]=s;
						c++;
						s="";
					}
					i--;
					j++;
				}
			}
			System.out.println(c);
		}
	}
}