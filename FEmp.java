//WAP To Check Net pay of an Employee using Constructors or Functions 
import java.io.*;
import java.lang.*;
class FEmp
{
	String name; //Variable to store the employee's Name
	long bp; //To store Basic Pay
	double da=0,hra=0,md=0,pf=0,gr=0,net=0;/*Variables to store Dearness, HouseRent, Medical Allowance Respectively Provident Fund 
											and Gross pay and Net Pay*/
	void details()throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter Your Name : ");
		name=venki.readLine();
		System.out.println("\nEnter your BAsic Pay : ");
		bp=Long.parseLong(venki.readLine());
	}
	void compute()
	{
		da=bp*0.40;			//Calculating Dearness Allowance 
		hra=bp*0.10;        //Calculating House rent Allowance 
		pf=bp*8.33/100;     // Calculating Provident Fund
		md=bp*1.67/100;     // Calculating Medical Allowane 
		
		gr=bp+da+hra+md;   //Calculating Gross Pay
		net=gr-pf;          // Calculating Net Pay 
	}
	void display()
	{
		System.out.println("\nEmployee's Name                 : "+name);  // Displaying Details 
		System.out.println("\nEmployee's Basic Pay            : "+bp);
		System.out.println("\nEmployee's House Rent Allowance : "+hra);
		System.out.println("\nEmployee's Medical Allowance    : "+md);
		System.out.println("\nEmployee's Provident Fund       : "+pf);
		System.out.println("\n");
		System.out.println("Employee's Gross Pay            : "+gr);
		System.out.println("Employee's Net Pay              : "+net);
	}
	public static void main(String[]args) throws IOException
	{
		FEmp ob=new FEmp();  //Creating Object of the class
		ob.details(); //Calling the functions
		ob.compute();
		ob.display();
	}
}