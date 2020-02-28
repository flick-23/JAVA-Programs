import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
class SAKTAN
{
	int a[][]=new int[100][100];
	void row(int X,int M)		// add 1 to row
	{
		for(int i=1;i<=M;i++)
		{
			a[X][i]++;
		}
	}
	void col(int Y,int N)		//add 1 to col
	{
		for(int i=1;i<=N;i++)
		{
			a[i][Y]++;
		}
	}
	void calculate(int N,int M)		//find odd numbers
	{
		int c=0;
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=M;j++)
			{
				if(a[i][j]%2!=0)
					c++;
			}
		}
		System.out.println(c);
	}
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
			SAKTAN ob = new SAKTAN();
			int n=venki.nextInt();
			int m=venki.nextInt();
			int q=venki.nextInt();
			for(int Q=0;Q<q;Q++)
			{
				int x=venki.nextInt();	//row
				int y=venki.nextInt();	//columun
				ob.row(x,m);
				ob.col(y,n);
			}
			ob.calculate(n,m);
		}
	}
} 