import java.util.Scanner;
class Schol2
{
	public static void main(String[] args)
	{
		Scanner venki=new Scanner(System.in);
		
		int pc,year,cost;
		int co,cos;
		double dis=0,tot=0;
		
		System.out.println("\nEnter the Number of Computers you want to Buy:");
		pc=venki.nextInt();
		System.out.println("\n\t15% Discount If the Deal is More than 5 Years");
		System.out.println("\nEnter The Number of Years You Want to Deal With:");
		year=venki.nextInt();
		
		co=pc*31500;
		cos=pc*31000;
		cost=pc*29000;
		
		if(pc<=20)
		{
			System.out.println("\nAmount to be Paid:"+co);
			if(year>5)
			{
				dis=co-(co*0.15);
				System.out.println("\nAmount to be paid:"+dis);
			}
		}
		else if(pc>20&&pc<=39)
		{
			System.out.println("\nAmount to be Paid:"+cos);
			if(year>5)
			{
				dis=cos-(cos*0.15);
				System.out.println("\nAmount to be paid:"+dis);
			}
		}
		else if(pc>=40)
		{			
			System.out.println("\nAmount to be Paid:"+cost);
			if(year>5)
			{
				dis=cost-(cost*0.15);
				System.out.println("\nAmount to be Paid including 15% Discount:"+dis);
			}
				
			
		}
		else
			System.out.println();
		
		
		
		
	}

			
}