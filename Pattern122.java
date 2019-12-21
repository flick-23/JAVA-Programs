/*WAP to display the given pattern :
11
12 22
13 23 33 
14 24 34 44
15 25 35 45 55 
*/
import java.io.*;
import java.lang.*;
class Pattern122
{
	public static void main(String[]args)
	{
		int i=11,j=12;
		while(j<=55)
		{
			System.out.print(i+" ");
			System.out.println();
			System.out.print(j+" ");
			i++; j=j+10;
		}
	}
}