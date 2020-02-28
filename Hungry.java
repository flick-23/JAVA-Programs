import java.util.Scanner;
class Hungry
{public static void main(String[]args)
	{Scanner venki=new Scanner(System.in);
		long T=venki.nextLong();
		if(T>=1&&T<=1000000)
		{	while(T!=0)
			{
				long N=venki.nextLong();
				if(N>=1&&N<=Math.pow(10,18))
				{
					if(N%2==0)
						System.out.println("YES\n");
					else
						System.out.println("NO\n");
				}T--;
			}}}}  