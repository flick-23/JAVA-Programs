import java.util.Scanner;
class Schol5
{
	public static void main(String[] args)
	{
		Scanner venki=new Scanner(System.in);
		
		double par;
		int wei; 
		double tot,total;
		
		System.out.println("\n\t25/-  For 1000gms\n\t10/- Added for Every 500gms More than 1000gms");
		System.out.println("\nEnter The Weight of The Parcel in Grams:");
		wei=venki.nextInt();
		
		if(wei>=1500)
		{
			par=wei-1000;
			tot=(par*0.02)+25;
			System.out.println("\nAmount to Be paid:"+tot);
		}
		else
		{
			total=25;
			System.out.println("\nAmount to be Paid:"+total);
		}
		
		
	}
}