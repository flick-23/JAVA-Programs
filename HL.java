import java.io.*;
import java.lang.*;
class HL
{
	public static void main( String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,m,lcm1=1,lcm2=1,flag1=0,flag=0;
		
		System.out.println ("\n Enter two values to find HCF and LCM");
		m=Integer.parseInt(br.readLine());
		n=Integer.parseInt(br.readLine());
		
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
			System.out.println("The LCM is: "+lcm1);
				
		
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
			System.out.println("HCF is:"+i);
		}
		else
			System.out.println("HCF is: 1");
		
		
	}
}	