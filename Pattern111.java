//WAP TO Print the output 1 11 111 1111 11111....
import java.lang.*;
class Pattern111
{
	public static void main(String[]args)
	{
		long i=1;
	
		while(i<=1111)
		{
			i=i*10+1;
			System.out.print(i+" ");
		}
	}
}