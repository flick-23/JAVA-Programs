import java.io.*;
import java.util.Scanner;
import java.lang.*;
class ChocolateFeast
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int r=0,w=0,n,c,m,choc=0,i,a[]=new int[1000];
		for(i=0;i<T;i++)
		{
			n=venki.nextInt();
			c=venki.nextInt();
			m=venki.nextInt();
			choc=n/c;
			w=choc;
			while(w>=m)
			{
				r=0;
				if(w==m)
				{
					choc++;
				}
				if(w>m)
				{
					r=w%m;
					choc+=w/m;
				}
				w=r+(w/m);
			}
			a[i]=choc;
		}
		for(i=0;i<T;i++)
			System.out.println(a[i]);
	}
}
