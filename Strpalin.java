import java.io.*;
import java.lang.*;
class Strpalin
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int s1=0,i,s2=0,l=0,flag=0;
		String c; char ch,ch1;
		System.out.println("\nEnter the Number of Test Cases : ");
		int t=Integer.parseInt(venki.readLine());
		if(t>=1&&t<=10)
		{
			while(t-->0)
			{
				System.out.println("\nEnter the string A & B respectively :");
				String a=venki.readLine();
				String b=venki.readLine();
				s1=a.length(); s2=b.length(); l=s1+s2;
				for(i=0;i<l;i++)
				{
					ch=a.charAt(0);
					ch1=b.charAt(i);
					if(ch==ch1)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
					System.out.println("\nYES");
				else
					System.out.println("\nNO");
			}
		}
		else 
			System.out.println("\nINVALID NUMBER OF TEST CASES!");
	}
}