import java.io.*;
import java.lang.*;
class Fascinating
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader venki=new BuffferedReader (new InputStreamReader(System.in));
		
		int num,i=0,t=0;
		
		System.out.println("\nEnter a Number : ");
		num=Integer.parseInt(venki.readLine());
		
		for(;i<3;i++)
		{
			t=i*num;
		}
		
		System.out.println(t);
	}	
}