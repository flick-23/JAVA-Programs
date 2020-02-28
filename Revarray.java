import java.io.*;
class Revarray
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int [100];
		System.out.println("\nEnter the Array Size : ");
		int n=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the Elements of the Array : ");
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(venki.readLine());
		}
		System.out.println("\nEntered Array : \n");
		for(i=0;i<n;i++)
			System.out.print(" "+a[i]);
		
		System.out.println("\nReverse of the Array : \n");
		for(i=n-1;i>=0;i--)
			System.out.print(" "+a[i]);
	}
}