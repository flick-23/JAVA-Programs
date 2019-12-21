import java.util.Scanner;
class Pattern12
{
	public static void main(String[]args)
	{
		//Scanner venki=new Scanner(System.in);
		int i,j=5,k,space=1,space2=4,t;
		
		for(i=5;i>=1;i--)
		{
			for(k=1;k<space;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=1;j++)
			{
				if(i!=1)
				System.out.print("*");
			}
			for(t=space2;t>=1;t--)
			{
				System.out.print("  ");
			}
			for(j=1;j<=1;j++)
			{
				if(i!=1)
				System.out.print("*");
			}
		if(i!=1){
		System.out.println();}
			space++;
			space2--;
		}
		space=5;
		for(i=1;i<=5;i++)
		{
			for(k=1;k<=space;k++)
			{
				if(i!=1)
				System.out.print(" ");
				else
					System.out.print("");
			}
			for(j=1;j<=1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
		}
	}
}