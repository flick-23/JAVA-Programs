import java.util.Scanner;
class Main
{public static int SimpleAdding(int num){
	int i,sum=0;
		for(i=1;i<=num;i++)
		{sum+=i;}	
		num=sum;		
		return num;}
	public static void main(String[]args)
	{Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		Main obj=new Main();
		int add=obj.SimpleAdding(n);
		System.out.println("\n"+add);
	}}