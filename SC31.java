import java.io.*;
import java.lang.*;
import java.util.*;
class SC31
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		for(int t=0;t<T;t++)
		{
			int n=Integer.parseInt(venki.readLine());
			int i;
			String s[]=new String[n];
			for(i=0;i<n;i++)
				s[i]=venki.readLine();
			for(i=0;i<n-1;i++)
			{
				String str1=s[i],str2=s[i+1];
				for(int j=0;j<str1.length();j++)
				{
					char ch1=str1.charAt(j),ch2=str2.charAt(j);
					if(ch1=='1' && ch2 == '1')
						str2=str2.substring(0,j)+'0'+str2.substring(j+1);
					else if (ch1=='0' && ch2=='0')
						str2=str2.substring(0,j)+'0'+str2.substring(j+1);
					else
						str2=str2.substring(0,j)+'1'+str2.substring(j+1);
				}
				s[i+1]=str2;
			}
			int c=0;
			for(i=0;i<s[n-1].length();i++)
				if(s[n-1].charAt(i)=='1')
					c++;
			System.out.println(c);
		}
	}
}