import java.io.*;
import java.lang.*;
import java.util.*;
class  TEST
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int i=0;
		while(i!=42)
		{
			i=venki.nextInt();
			if(i==42)
				break;
			System.out.println(i);
		}
	}	
}