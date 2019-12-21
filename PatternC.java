import java.io.*;
import java.util.*;
class PatternC
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int i,j,C=n,k=0,x=0,c=0,N=0;
		N=2*n-1;
		x=((2*n-1)/2)+2;
		for(i=0;i<2*n-1;i++)
		{
			k=N;
			C=n;
			c++;
			if(c==x)
			{
				break;
			}
			for(j=0;j<2*n-1;j++)
			{
				if(i==j)
				{
					while(k!=0)
					{
						System.out.print(C+" ");
						k--;
					}
				}
				else if(k!=0)
				{
					System.out.print(C+" ");
					C--;
				}
				else if(k==0 && C==n)
				{
					break;
				}
				else //(k==0)
				{
					C++;
					System.out.print(C+" ");
					if(C==n)
						break;
				}
			}
			N=N-2;
			System.out.println();
		}
		x--;
		C=0;
		c=0;
		N=2*n-1;
		int s=n-x;
		int m=((2*n-1)/2)-1;
		N=3;
		for(i=0;i<2*n-1;i++)
		{
			c=n;
			k=N;
			C++;
			if(C==x)
			{
				break;
			}
			for(j=0;j<2*n-1;j++)
			{
				if((i+j)==m)
				{
					while(k!=0)
					{
						System.out.print(c+" ");
						k--;
					}
				}
				else if(k==0 && c==n)
				{
					break;
				}
				else if(k==0)
				{
					c++;
					System.out.print(c+" ");
				}
				else if(k!=0)
				{
					System.out.print(c+" ");
					c--;
				}
			}
			N=N+2;
			System.out.println();
		}
		
	}
}