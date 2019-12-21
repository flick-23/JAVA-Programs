import java.util.Scanner;
class Schol7
{
	public static void main(String[] args)
	{
		Scanner venki=new Scanner(System.in);
		int i,p;
		System.out.println("\nEnter the Number to Compute the Series:");
		p=venki.nextInt();
		for(i=1;i<=p;i++)
		
			p=p*i;
		
		System.out.println("\nProduct Of the Series:"+p);
		
	}
}