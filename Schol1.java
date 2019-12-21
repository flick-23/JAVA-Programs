import java.util.Scanner;
class Schol1
{
	public static void main(String[] args)
	{
		Scanner venki=new Scanner(System.in);
		
		double basic;
		double dearness,house,medics,fund;
		double net,gross;
		double name;
		
		System.out.println("\nEnter Your PIN:");
		name=venki.nextFloat();
		System.out.println("\nEnter Your Basic Pay:");
		basic=venki.nextFloat();
		
		 dearness=basic*0.25;
		 house=basic*0.15;
	     medics=basic*0.10; 
		 fund=basic*0.12;
		 net=basic+dearness+house+medics+fund;
		 gross=net-fund;
		
		System.out.println("\nDearness Allowance:"+dearness);
		System.out.println("\nHouse Rent Allowance:"+house);
		System.out.println("\nMedical Allowance:"+medics);
		System.out.println("\nProviedent Fund:"+fund);
		System.out.println("\n\n\tNet Pay="+net);
		System.out.println("\n\n\tGross Pay="+gross);
		
	}
}