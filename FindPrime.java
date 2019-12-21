import java.util.Scanner;
class FindPrime
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int sum=0,a=0,flag=0;
		do
		{
			sum=0;
			for(int i=n;i>=1;i--)
			{
				if(n%i==0)
					sum++;
			}
			System.out.println("SUM : "+sum);
			if(sum==2)
			{
				a=n;
				flag=1;
			}
			else
				n--;
		}while(flag!=1);
		System.out.println("\nPRIME : "+a);
	}
}