import java.util.Scanner;
class Secgre
{public static void main(String[]args) 
	{Scanner venki=new Scanner(System.in);
		int a,b,c;
		System.out.println("\nEnter 3 Values A,B & C respectively :");
		a=venki.nextInt();b=venki.nextInt();c=venki.nextInt();
		if((a>b&&a<c)||(a<b&&a>c))
			System.out.println("\nSecond Largest Number : "+a);
		else if((b>a&&b<c)||(b<a&&b>c))
			System.out.println("\nSecond Largest Number : "+b);
		else 
			System.out.println("\nSecond Largets Number : "+c);	}}