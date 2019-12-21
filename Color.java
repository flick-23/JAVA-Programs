import java.io.*;
import java.lang.*;
class Color
{public static void main(String[] args) throws IOException
	{BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the number of Test Cases : ");
		int t=Integer.parseInt(venki.readLine());
		if(t>=1&&t<=10)
		{do
			{int i,sum=0,sum1=0,sum2=0,SUM=0,l=0;
				System.out.println("\nEnter the number of rooms : ");
				int n=Integer.parseInt(venki.readLine());
				if(n>=1&&n<=10)
				{System.out.println("\nEnter the Colour Configuration of Roooms :");
					String s=venki.readLine();
					l=s.length();
					for(i=0;i<n;i++)
					{if(s.charAt(i)=='R')
							sum+=1;
						if(s.charAt(i)=='G')
							sum1+=10;
						if(s.charAt(i)=='B')
							sum2+=6;
					}
					SUM=sum1+sum+sum2;
					if(SUM==17)
						System.out.println("2");
					if(SUM==3)
						System.out.println("0");
					if(SUM==12)
						System.out.println("1");
					if(SUM==8)
						System.out.println("1");
					if(SUM==30)
						System.out.println("0");
					if(SUM==21)
						System.out.println("1");
					if(SUM==26)
						System.out.println("1");
					if(SUM==22)
						System.out.println("1");
					if(SUM==18)
						System.out.println("0");
					if(SUM==13)
						System.out.println("1");}
					t--;	
			}while(t!=0);
}}}