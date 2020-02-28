import java.io.*;
import java.util.*;
import java.lang.*;
class MARM
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(venki.readLine());
		
		for(int T=0;T<t;T++)
		{
			StringTokenizer tk = new StringTokenizer(venki.readLine());
			int n=Integer.parseInt(tk.nextToken());
			long k=Long.parseLong(tk.nextToken());
			long a[]=new long[n];
			int x,y,i;
			long A,B;
			StringTokenizer tk1 = new StringTokenizer(venki.readLine());
			for(i=0;i<n;i++)
				a[i]=Long.parseLong(tk1.nextToken());
			for(i=0;i<k;i++)
			{
				x=i%n;
				y=n-(i%n)-1;
				A=a[x];
				B=a[y];
				a[x]=A^B;
			}
			for(i=0;i<n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
	}
}