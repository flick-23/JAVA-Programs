// UNSOLVED YET
import java.io.*;
import java.util.*;
class CircularMerging
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner (System.in);
		int T=venki.nextInt();
		int i,j,n,k=0;
		long points=0;long x=0,p=10000000000l;
		for(int t=0;t<T;t++)
		{
			points=0;
			n=venki.nextInt();
			long a[]=new long[n],b[]=new long[n];
			for(i=0;i<n;i++)
				a[i]=venki.nextLong();
			
			for(i=0;i<n;i++)
			{
				for(int s=0;s<n;s++)
				{
					b[s]=a[s];
					System.out.print(b[s]+" ");
				}
				System.out.println("\n");
				k=i;
				points=0;
				x=0;
				for(j=0;j<n-1;j++)
				{
					System.out.println("K :"+k);
					if(k==(n-1))
					{
						x=b[k];
						k=0;
						x+=b[k];
						b[k]=x;
					}
					else
					{
						x=b[k]+b[k+1];
						b[k+1]=x;
					}
					for(int s=0;s<n;s++)
					{
						System.out.print(b[s]+" ");
					}
					points+=x;
					System.out.println("Points :"+points);
					k++;
				}
				//System.out.println("Points :"+points);
				if(points<p)
				{
					p=points;
				}
			}
			System.out.println(p);
		}
	}
}
