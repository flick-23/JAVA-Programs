import java.io.*;
import java.lang.*;
class Fascinating
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader venki=new BufferedReader (new InputStreamReader(System.in));
		
		int num,i=0,t=0,f1=0,rem=0;
		int rem2=0, rem3=0, f2=0 ,f3=0;
		
		System.out.println("\nEnter a Number : ");
		num=Integer.parseInt(venki.readLine());
		int temp2=num, temp3=num;
		int n1=1*num; 
		int n2=2*num;
		int n3=3*num;
		
		while(num!=0)
		{
			rem=n1%10; 
			f1=f1+rem;  System.out.println("F1 :"+f1);
			num=num/10;
		}
		
		while(temp2!=0)
		{
			rem2=n2%10;
			f2=f2+rem2;  System.out.println("F2 :" +f2);
			temp2=temp2/10;
		}
		
		while(temp3!=0)	
		{
			rem3=n3%10;
			f3=f3+rem3;  System.out.println("F3 : "+f3);
			temp3=temp3/10;
		}
		
		int fas=f1+f2+f3;  System.out.println("Fas :"+fas);
		if(fas==36)
		{
			System.out.println("\nIt is Fascinating Number !");
		}
		else 
			System.out.println("\nIt is not Fascinating Number !");
		
	}	
}