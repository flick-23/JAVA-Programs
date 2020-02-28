import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Acdemy
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(venki.readLine());
		int T=Integer.parseInt(venki.readLine());
		if(T>=1&&T<=10)
		{
			while(T-->0)
			{
				int N=Integer.parseInt(venki.readLine());
				if(N>=1&&N<=100)
				{
					int i=Integer.parseInt(st.nextToken(venki.readLine()));
					int c=Integer.parseInt(st.nextToken(venki.readLine()));
				}
			}
		}	
	}
}