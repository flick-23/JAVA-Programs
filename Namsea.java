import java.io.*;
import java.lang.*;
class Namsea
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		String nam[]=new String[20],sea;
		int i,flag=0;
		
		System.out.println("\nEnter 20 Names :");
		for(i=0;i<20;i++)
		{
			nam[i]=venki.readLine();
		}
		
		System.out.println("\nEnter the name to be Searched \nNOTE: The Name will not match if the name to be searched is not Case Sensitive!");
		sea=venki.readLine();
		
		for(i=0;i<20;i++)
		{
			if(nam[i].equals(sea))
			{
				flag=i+1;
				break;
			}
		}
		if(flag>0)
		{
			System.out.println("\nName Found At Position : "+flag);
		}
		else 
		{
			System.out.println("\nError 404!!!!\n\nElement Not Found..");
		}
	}
}