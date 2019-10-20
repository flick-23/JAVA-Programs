import java.io.*;
import java.lang.*;
import java.util.*;
class Bubblesort
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the array size : ");
		int n=Integer.parseInt(venki.readLine());
		int a[]=new int[n];
		int i,j,temp=0;
		System.out.println("\nEnter the array elements :");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(venki.readLine());
		}
		System.out.println("\nSorting The Values in Ascending Order!");
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<(n-1-i);j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("\nThe Sorted Values Are:");
		for(i=0;i<n;i++)
			System.out.print("\t"+a[i]);
	}
}