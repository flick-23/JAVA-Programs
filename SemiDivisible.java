import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.math.*;
class SemiDivisile
{
	void root(long long int r)
	{
		return (math.sqrt(r));
	}
	
	void prime(long long int u)
	{
		int flag=0,s=0;
		while(flag! =1)
		{
			for(long long int j=1;j<=u;j++)
			{
				if(u%j==0)
					s++;
			}
			if(s==2)
			{
				flag=1;
			}
			else
				u++;
		}
		return(u);
			
	}
	
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		SemiDivisile ob;
		
		long long int L,R,i,lps,ups;
		int sum=0;
		
		L=venki.nextInt();
		R=venki.nextInt();
		
		for(i=L;i<=R;i++)
		{
			lps=ob.root(i);
			ups=ob.prime(i);
			
			if(i%L!=0 && i%R!=0)
				sum+=i;
				
		}
		System.out.println(sum);
	}
}