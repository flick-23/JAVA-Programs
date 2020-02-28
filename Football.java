import java.io.*;
import java.lang.*;
import java.util.*;
class  Football
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
			int n=venki.nextInt();
			int a[]=new int[n],b[]=new int[n];
			int i,max=-9999,j,score=0;
			for(i=0;i<n;i++)
			{
				a[i]=venki.nextInt();
			}
			for(i=0;i<n;i++)
			{
				b[i]=venki.nextInt();
			}
			for(i=0;i<n;i++)
			{
				score=(a[i]*20)-(b[i]*10);
				if(score>max)
				{
					max=score;
				}
			}
			if(max>0)
				System.out.println(max);
			else
				System.out.println("0");
		}
	}	
}