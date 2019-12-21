import java.io.*;
import java.lang.*;
class Bubblesort
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[10];
		int i,j,temp=0;
		System.out.println("\nEnter 10 Values:");
		for(i=0;i<10;i++)
		{
			a[i]=Integer.parseInt(venki.readLine());
		}
		System.out.println("\nSorting The Values in Ascending Order!");
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
		System.out.println("\nThe Sorted Values Are:");
		for(i=0;i<10;i++)
			System.out.print("\t"+a[i]);
	}
}