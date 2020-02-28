import java.io.*;
import java.lang.*;
import java.util.*;
class CODEFA8
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		for(int t=0;t<T;t++)
		{
			int flag=0;
			int n=Integer.parseInt(venki.readLine());
			System.out.println("2\n3");
			for(int i=4;i<n;i++)
			{
				flag=0;
				for(int j=3;j<i;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag!=1)
					System.out.println(i);
			}
		}
	}
}