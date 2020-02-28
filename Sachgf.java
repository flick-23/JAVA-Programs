import java.io.*;
class Sachgf
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(venki.readLine());
		int temp=0,i,flag=0;long c=10^9,rem=0,rem1=0;
		if(t>=1&&t<=1000)
		{
			long a[]=new long[t],b[]=new long[t];
			
				for(i=0;i<t;i++)
				{
					a[i]=Integer.parseInt(venki.readLine());
				}
				for(i=0;i<t;i++)
				{
					rem=a[i]%1007;
					b[i]=rem;
					
				}
				for(i=0;i<t;i++)
				{
					for(int j=0;j<t;j++)
					{
						if(i!=j)
						{
							if(b[i]!=b[j])
							{
								flag=1;
							}
							else
							{
								flag=0;
								break;
							}
						}
					}
					if(flag == 1)
					{
						System.out.println("\n"+b[i]);
					}
				}
			
		}
	}
}