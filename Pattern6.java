import java.util.Scanner;
class Pattern6
{
	public static void main(String[]a)
	{
		Scanner venki=new Scanner(System.in);
		
		System.out.println("\nEnter the value of N :");
		int n=venki.nextInt();
		int i,j,k,space,ev=2;
		char ch='a';
		
		for(i=n;i>=1;i--)
		{
			ch='a';
			for(j=i;j>0;j--)
			{
				System.out.print(ch);
				ch++;
			}
			for(space=3;space<=ev;space++)
			{
				System.out.print(" ");
			}
			for(k=i;k>0;k--)
			{
				ch--;
				System.out.print(ch);
			}
			System.out.println();
			ev+=2;
		}
		ev-=4;
		for(i=2;i<=n;i++)
		{
			ch='a';
			for(j=i;j>0;j--)
			{
				System.out.print(ch);
				ch++;
			}
			for(space=3;space<=ev;space++)
			{
				System.out.print(" ");
			}
			for(k=i;k>0;k--)
			{
				ch--;
				System.out.print(ch);
			}
			System.out.println();
			ev-=2;
		}
	}
}