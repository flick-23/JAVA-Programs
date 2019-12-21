import java.io.*;
import java.util.Scanner;
class LargestPalindrome
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int i,j,temp=0,r=0,rev=1,a[]=new int[100000];
		for(int t=0;t<T;t++)
		{
			int N=venki.nextInt();
			for(i=100;i<1000;i++)
			{
				for(j=100;j<=i;j++)
				{
					if(i*j<=N)
					{
						temp=N;
						while(N!=0)
						{
							r=N%10;
							rev=rev*10+r;
							N=N/10;
						}
						if(temp==rev)
						{
							a[t]=temp;
						}
					}
				}
			}
		}
		for(i=0;i<T;i++)
			System.out.println(a[t]);
	}
}