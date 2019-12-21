import java.io.*;
import java.lang.*;
class HcfLcm
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int n,m,lcm1=1,lcm2=1,flag=0,flag1=0;
		
		System.out.println("\nEnter the 2 Numbers for their LCM & HCF : ");
		m=Integer.parseInt(venki.readLine());
		n=Integer.parseInt(venki.readLine());
		int i,j;
		
		for(i=1;i<=m;i++)
		{
			lcm1=n*i;
			for(j=1;j<=n;j++)
			{
				lcm2=m*j;
				if(lcm1==lcm2)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		
		System.out.println("\nLCM : "+lcm1);
		
		for(i=2;i<=n;i++)
		{
			if(n%i==0 && m%i==0)
			{
				flag1=1;
				break;
			}
			if(flag1==1)
				break;
		}
		if(flag1==1)
		{
			System.out.println("\nHCF : "+i);
		}
		else 
			System.out.println("\nHCF : 1");
			
	}
}