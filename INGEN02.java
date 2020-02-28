import java.io.*;
import java.lang.*;
import java.util.*;
class INGEN02
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner (System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
			int n=venki.nextInt();
			int a[]=new int[n];
			int i,sum=0;
			for(i=0;i<n;i++)
			{

				a[i]=venki.nextInt();
				sum+=a[i];
			}
			if(sum%2==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}