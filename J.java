import java.io.*;
import java.lang.*;
import java.util.*;
class J
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		//
		int t=Integer.parseInt(venki.readLine());
		for(int T=0;T<t;T++)
		{
			int k=0,sum=0;
			int n=Integer.parseInt(venki.readLine());
			int c[]=new int[n],a[]=new int[100000][100000];
			for(i=0;i<n;i++)
			{
				StringTokenizer tk = new StringTokenizer(venki.readLine());
				c[i]=Integer.parseInt(tk.nextToken());
				for(j=0;<c[i];j++)
				{
					StringTokenizer tk1 = new StringTokenizer(venki.readLine());
					a[i][j]=Integer.parseInt(tk1.nextToken());
					if(j%2==0)
					{
						sum+=a[i][k];
						k++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}