import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;
class Vsq
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		if(T>=1&&T<=100)
		{
			int N[]=new int [T],i,u,v,A;
			for(i=0;i<T;i++)
			{
				N[i]=Integer.parseInt(venki.readLine());
				if(N[i]>=1&&N[i]<=100000)
				{
					StringTokenizer st=new StringTokenizer(venki.readLine());
					for(i=0;i<(N[i]-1);i++)
					{
						u=Integer.parseInt(st.nextToken());
						v=Integer.parseInt(st.nextToken());
					}
					A=Integer.parseInt(venki.readLine());
				}
			}	
		}			
	}
}