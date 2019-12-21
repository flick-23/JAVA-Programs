import java.io.*;
import java.lang.*;
class X1
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		long comp,Cos=0,COs=0,COS=0;
		double dis;		
				
		System.out.println("\nEnter the Number of Computers you want to buy : ");
		comp=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the Number of years you want to deal with : \nNOTE : YOU GET 15% DISCOUNT YOU DEAL FOR MORE THAN 5 YEARS!!");
		int year=Integer.parseInt(venki.readLine());
		
		Cos=31500*comp; COs=31000*comp; COS=29000*comp;
		
		if(comp<20)
		{
			System.out.println("\nAmount to paid : "+Cos);
			if(year>5)
			{
				dis=Cos-(Cos*0.15);
				System.out.println("\nAmount to Paid with discount : "+dis);
			}
				
		}
		
		else if(comp>=20 && comp<=39)
		{
			System.out.println("\nAmount to be paid : "+COs);
			if(year>5)
			{
				dis=COs-(COs*0.15);
				System.out.println("\nAmount to be paid with discount : "+ dis);
			}
		}

		else 
		{
			System.out.println("\nAmount to be paid : "+ COS);
			if(year>5)
			{
				dis=COS-(COS*0.15);
				System.out.println("\nAmount to be paid with discount : "+dis);
			}
		}
	}
}