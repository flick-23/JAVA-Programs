import java.io.*;
class Merge
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int p[]=new int[6],q[]=new int[4],r[]=new int[10];
		int i,j,c=0;
		
		System.out.println("\nEnter the Elements of First Array :");
		for(i=0;i<6;i++)
		{
			p[i]=Integer.parseInt(venki.readLine());
		}
		System.out.println("\n Entered Elements are :");
		for(i=0;i<6;i++)
		{
			System.out.print("\t"+p[i]);
		}
		
		System.out.println("\n\nEnter the Elements of Second Array :");
		for(j=0;j<4;j++)
		{
			q[j]=Integer.parseInt(venki.readLine());
		}
		System.out.println("\n Entered Elements in this Array are :");
		for(j=0;j<4;j++)
		{
			System.out.print("\t"+q[j]);
		}
		
		for(i=0;i<10;i++)
		{
			if(i<6)
			{
				r[i]=p[i];
			}
			else
			{
				r[i]=q[c];
				c+=1;
			}
		}
		System.out.println("\n\nElements of Third array  after Merging are :");
		for(i=0;i<10;i++)
		{
			System.out.print("\t"+r[i]);
		}
	}
}