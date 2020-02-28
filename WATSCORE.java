import java.io.*;
import java.lang.*;
import java.util.*;
class WATSCORE
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();	
		for(int T=0;T<t;T++)
		{
			int n=venki.nextInt();
			int p[]=new int[n+1],s[]=new int[n+1];
			int i,j;
			for(i=0;i<n;i++)
			{
				p[i]=venki.nextInt();
				s[i]=venki.nextInt();
			}
			int temp=0,sum=0;
			for(i=0;i<n-1;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(p[i]>p[j])
					{
						temp=p[i];
						p[i]=p[j];
						p[j]=temp;
						temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
			}
			int max=-1;
			i=0;
			while(i<n)
			{
				max=-1;
				if(p[i]!=9 && p[i]!=10 && p[i]!=11)
				{
					try
					{
						if(p[i]==p[i+1])
						{
							do
							{
								if(s[i]>max)
								{
									max=s[i];
								}
								if(p[i]==p[i+1])
								{
									if(s[i+1]>max)
										max=s[i+1];
								}
								i++;
							}while(p[i]==p[i+1]);
							sum+=max;
						}
						else
						{
							sum+=s[i];
						}
					}
					catch (Exception e)
					{
						i--;
					}
				}
				i++;
			}
			System.out.println(sum);
		}
	}
}