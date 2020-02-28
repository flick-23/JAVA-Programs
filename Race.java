import java.util.Scanner;
class Race
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		if(T>=1&&T<=100)
		{
			do
			{
				long n=venki.nextLong();
				if(n>=1&&n<=1000000)
				{
					if(n%2!=0)
						System.out.println("JENNY\n");
					else
						System.out.println("JACK\n");
				}
				T--;
				}while(T!=0);
		}
	}
}