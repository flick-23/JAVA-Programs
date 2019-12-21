import java.io.*;
class Selectionsort
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader (new InputStreamReader(System.in));
		int a[]=new int[15];
		int i,j,temp,least=0;
		
		System.out.println("\nEnter 10 Values:");
		for(i=0;i<10;i++)
		{
			a[i]=Integer.parseInt(venki.readLine());
		}
		for(i=0;i<9;i++)
		{
			least=i;
			
				for(j=i+1;j<10;j++)
				{
					if(a[j]<a[least])
						least=j;
				}
			temp=a[i];
			a[i]=a[least];
			a[least]=temp;
		}
		System.out.println("\nPlease Wait......");
		System.out.println("\nValues Sorted..........!");
		System.out.println("\nSorted Values Are:");
		for(i=0;i<10;i++)
			System.out.print("\t"+a[i]);
	}
}