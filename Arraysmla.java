//Program to Check Greatest and Smallest in Array Including its Position
import java.io.*;
import java.lang.*;
class Arraysmla
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int a[]=new int[10],i,j,temp=0;
		
		System.out.println("\nEnter 10 Values in the Array :");
		for(i=0;i<10;i++)
		{
			a[i]=Integer.parseInt(venki.readLine());
		}
		
		for(i=0;i<9;i++)
		{
			for(j=0;j<(9-i);j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
		for(i=1;i<10;i++)
		{
			System.out.println("\nLargest Number in Array is :"+a[i]);
		}
		for(i=10;i<10;i++)
		{
			System.out.println("\nSmallest Number in Array is :"+a[i]);
		}
	}
}