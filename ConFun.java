import java.lang.*;
import java.io.*;

class ConFun
{
	int l,b; //These are Instance Variables..These  variables can be in used in function and in constructor
	double a;
	
	A()  //This a Constructor......A Constructor's name has to be Same as the class name. This constructor is Default cz der are no parameters 
	{
		System.out.println("Hello");
		
	}
	A(int a1,int b1)//This is a parametersied  constructor( a1 & b1 are parameters)
	{               //Here a1 and b1 are recieving the values from amin class 
	  l=a1;
      b=b1;	
      System.out.println("Area of rectangle ="+(a1*b1));	  
	}
	A(int q,double p) /*If there are contructors than the program is said to be overloaded with constructors but there 
					    must be a little change. Ex One Con has all int variables than the other must not have all int 
						it must have other data types it can also have int but along with int there must be even different data type*/
	{
		System.out.println(p*q);
		
	}
	double venki(int r1) //This is function...if a function is returning a value it must have a return statement
	{                    //if a function is not returning any value than functions name should be written as ( void <fun name> (<datatype variable name>))
	  a=3.142*r1*r1;
	  return a;
	}
	
	public static void main(String []a)throws IOException
	{
     A obj1=new A(2,4); //Here the First constructor is called in the main class...Here 2&4 are the values assigned to a1 and b1 above 
	 A obj2=new A(2,2.3); //A Particular Constructor can be called only Once....
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter a radius:");
	 int r=Integer.parseInt(br.readLine());
	 
	 double a11=obj1.venki(r); //Here function venki is called in main class, variable a11 is used to contain the returned value from - 
	 System.out.println("Area ="+a11); // -the function....A function can be called multiple times....
  
	/*THIS WAS A SIMPLE PROGRAM TO SHOW THE USE OF CONSTRUCTORS & FUNCTIONS */ 
	}
}