import java.util.Scanner;
class Lastsam
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int N,M,i;
		System.out.println("\nEnter the value of N :");
		N=venki.nextInt();
		System.out.println("\nEnter the value of M :");
		M=venki.nextInt();
		int c=N-M;
		for(i=N-1;i>=c;i--)
		{
			System.out.print(" "+i);
		}
	}
}