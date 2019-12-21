import java.io.*;
import java.util.*;
class FrequencyNum
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		System.out.println("\nEnter the Array length :");
		int n=venki.nextInt();
		int a[]=new int[n],c[]=new int[n],b[]=new int[n];
		int i,j,C=0,k=0;
		System.out.println("\nEnter the array elements :");
		for(i=0;i<n;i++)
		{
			a[i]=venki.nextInt();
		}
		for(i=1;i<=100;i++)
		{
			C=0;
			for(j=0;j<n;j++)
			{
				if(i==a[j])
				{
					b[k]=i;
					C++;
					c[k]=C;
				}
			}
			if(C!=0)
			{
				k++;
			}
		}
		System.out.println("NUMBER\t:FREQUENCIES");
		for(i=0;i<k;i++)
		{
			System.out.println(b[i]+"\t\t"+c[i]);
		}
	}
}