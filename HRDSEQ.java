import java.io.*;
import java.lang.*;
import java.util.*;
class  HRDSEQ
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		for(int t=0;t<T;t++)
		{
			int i,j,x,k,l=0;
			int n=Integer.parseInt(venki.readLine());
			int a[]=new int[138];
			a[1]=0;
			a[2]=0;
			a[3]=1; a[4]=0;
			l=4;int c=0;
				for(i=5;i<=128;i++)
				{
					x=a[l]; 
					int flag=0;
					for(int check=l-1;check>=0;check--)
					{
						if(x==a[check])
						{
							flag=1;
							k=check;
							a[i]=l-k;
							break;
						}
					}
					if(flag==0)
					{
						a[i]=0;
					}
					l++;
				}
			int num=a[n];
			for(i=1;i<=n;i++)
				if(a[i]==num)
					c++;
			System.out.println(c);
		}
	}
}