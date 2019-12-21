import java.io.*;
class C1
{
	public static void main(String[]args)
	{
		int i,j,t,o=7,e=1;
		
		
		for(i=1;i<=3;i++)
		{
			for(t=3;t>=i;t--)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=e;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			e=e+2;
		}
		
	
		for(i=1;i<=4;i++)
		{
			for(t=2;t<=i;t++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=o;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			o=o-2;
		}
	}
}