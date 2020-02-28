import java.io.*;
import java.lang.*;
import java.util.*;
class IAREVERS
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(venki.readLine());
		for(int N=0;N<n;N++)
		{
			String s=venki.readLine();
			int l=s.length();
			s+=" ";
			String a[]=new String[l];
			int i=0,j=0;
			String word="";
			while(i<l)
			{
				if(s.charAt(i)!=' ')
				{
					while(s.charAt(i+1)!=' ')
					{
						if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' &&s.charAt(i)<='z' ))
							word+=s.charAt(i);
						i++;
					}
					if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' &&s.charAt(i)<='z' ))
						word+=s.charAt(i);
				}
				if(!(word.equals("")))
				{
					if(word.charAt(0)!=' ')
					{
						a[j]=word;
						j++;
					}
				}
				word="";
				i++;
			}
			for(i=j-1;i>=0;i--)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
}