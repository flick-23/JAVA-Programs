import java.io.*;
import java.util.*;
class BINADD
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(venki.readLine());
		for(int T=0;T<t;T++)
		{
			String a=venki.readLine();
			String b=venki.readLine();
			long c=0;
			long A=Long.parseLong(a,2);
			long B=Long.parseLong(b,2);
			long U=0;
			while(B>0)
			{
				A=U=A^B;
				B=((U^B)&B)*2;
				c++;			
			}
			System.out.println(c);
		}
	}
}
