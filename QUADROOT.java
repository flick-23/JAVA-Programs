import java.io.*;
import java.lang.*;
import java.util.*;
class QUADROOT
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int a=venki.nextInt();
		int b=venki.nextInt();
		int c=venki.nextInt();
		double x=Math.sqrt((b*b)-(4*a*c));
		double x1=(int)((-b)+x)/(2*a);
		double x2=(int)((-b)-x)/(2*a);
		int X1=(int)x1;
		int X2=(int)x2;
		System.out.println(X1+"\n"+X2);
	}	
}