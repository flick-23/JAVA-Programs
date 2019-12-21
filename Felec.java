/*Data Members     : Name,Consumer name, Units Consumed.
  Member Methids   : 1.To accept name , consumer number , units consumed 
					 2.To compute the electricity charges accordingly :
					   up to  100 units   :80paise
					   for next 100 units :Re 1 per unit
					   for more than 200 units 1.25 Rs per unit
					 3. To display the details including name & consumer number 
Write a main method to create object of a class & call the above memeber method */
import java.io.*;
import java.lang.*;
class Felec
{
	String name;
	int con_num;
	float unit,tot;
	
	void details()throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter The Consumer's name :");
		name=venki.readLine();
		System.out.println("\nEnter the Consumer's Number :");
		con_num=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the Units Consumed :");
		unit=Float.parseFloat(venki.readLine());
	}
	
	void compute()
	{
		if(unit<=100)
		{
			tot=(unit*80)/100;
		}
		else if(unit>100 && unit <=200)
		{
			tot=((100*80)/100)+((unit-100)*100)/100;
		}
		else
		{
			tot=((100*80)+(100*100)+(unit-200)*125)/100;
		}
	}
	
	void display()
	{
		System.out.println("\nConsumer's Name : "+name);
		System.out.println("\nConumed Units   : "+unit);
		System.out.println("\nBill to be paid : "+tot);
	}
	
	public static void main(String[]args) throws IOException
	{
		Felec ob=new Felec();
		ob.details();
		ob.compute();
		ob.display();
	}
}