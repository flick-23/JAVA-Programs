import java.util.Scanner;
class Schol6
{
	public static void main(String[] args)
	{
		Scanner venki=new Scanner(System.in);
		int a,v;
		int sum=0,wei=0;
		System.out.println("\nEnter The Value of N:");
		int num=venki.nextInt();
		System.out.println("\nEven Numbers:");
		
		for(a=0;a<=num;a++)
		{
			if(a%2==0)
			{
				System.out.println("\n\t"+a);
				sum=sum+a;
			}
		
		}
		
		System.out.println("\nSum of Even Numbers:"+sum);
		
		
		System.out.println("\nOdd Numbers:");
		for(v=0;v<=num;v++)
		{
			if(v%2!=0)
			{
				System.out.println("\n\t"+v);
				wei=wei+v;
			}
		}
		System.out.println("\nSum of the Odd Numbers:"+wei);
	}
}