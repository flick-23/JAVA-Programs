//Incomplete and incorrect
import java.io.*;
import java.lang.*;
import java.util.*;
class SIGNTURE
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner (System.in);
		int T=venki.nextInt();
		for(int t=0;t<T;t++)
		{
			int n=venki.nextInt();
			int m=venki.nextInt();
			String A[]=new String[n];
			int i,j;
			for(i=0;i<n;i++)
			{
				A[i]=venki.next();
			}
			int a[][]=new int[n][m];
			int b[][]=new int[n][m],c=0;
			for(i=0;i<n;i++)
			{
				String s=A[i];
				for(j=0;j<m;j++)
				{
					if(s.charAt(j)=='0')
						a[i][j]=0;	
					else
						a[i][j]=1;
				}
			}
			for(i=0;i<n;i++)
			{
				A[i]=venki.next();
			}
			for(i=0;i<n;i++)
			{
				String s=A[i];
				for(j=0;j<m;j++)
				{
					if(s.charAt(j)=='0')
						b[i][j]=0;	
					else
						b[i][j]=1;
				}
			}
			int dr=-(n-1),dc=-(m-1);
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					int flag=0,f=0;
					int x=a[i][j],y;
					for(int DC=dc;DC<n-1;DC++)
					{
						for(int DR=dr;DR<m-1;DR++)
						{
							try
							{
								y=b[i+dr][j+dc];
							}
							catch (Exception e)
							{
								f=1;
								y=0;
							}
							if(x==y)
							{
								if(f==0)
									b[i+dr][j+dc]=-1;
								c++;
								flag=1;
								break;
							}
						}
						if(flag==1)
							break;
					}
				}
			}
			System.out.println(c);
		}	
	}
}