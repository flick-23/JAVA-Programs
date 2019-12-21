import java.util.Scanner;
class Schol3
{
	public static void main(String[] args)
	{
		Scanner venki=new Scanner(System.in);
		
		int Shopping;
		double low,med,pre,high;
		double dis,disc,disco,discou;
		
		System.out.println("\n\t\t***********BIG SALE************");
		System.out.println("\n\t5% Discount for Shopping Less Than 2000/-\n\t25% Discount for shopping from 2001-5000/-\n\t35% Discount for Shopping 5001-10000/-\n\t50% Discount For Shopping More Than 10000/-");
		System.out.println("\n\nEnter the Total Amount of The Items Purchased:");
		Shopping=venki.nextInt();
		
		
		
		
		
		if(Shopping<=2000)
		{
			low=Shopping*0.05;
			dis=Shopping-low;
			System.out.println("\nAmount to be Paid Including 5% Discount:"+dis);
		}
		else if(Shopping>=2001&&Shopping<=5000)
		{
			med=Shopping*0.25;
			disc=Shopping-med;
			System.out.println("\nAmount to be Paid Including 25% Discount:"+disc);
		}
		else if(Shopping>=5001&&Shopping<=10000)
		{
			pre=Shopping*0.35;
			disco=Shopping-pre;
			System.out.println("\nAmount to be Paid Including 35% Discount:"+disco);
		}
		else if(Shopping>=10001)
		{
			high=Shopping*0.50;
			discou=Shopping-high;
			System.out.println("\nAmount to be Paid Including 50% Discount:"+discou);
		}
		else
			System.out.println();
	}
}