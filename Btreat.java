import java.io.*;
class Btreat
{
	public static void main (String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the Number of Test Cases : ");
		int t=Integer.parseInt(venki.readLine());
		if(t>=1&&t<=10)
		{
			do
			{
				System.out.println("\nEnter the Number of Gift Packets : ");
				int n=Integer.parseInt(venki.readLine());
				
				int c[]=new int[n];
				int c1[]=new int[n];
				int i,j,temp=0,co=0,sum=0,Sum=0,SUM=0,echo=0,avg=0,p=0;
				
				if(n>=1&&n<=1000)
				{
					System.out.println("\nEnter the number of chocolates in each packet :");
					for(i=0;i<n;i++)
					{
						c[i]=Integer.parseInt(venki.readLine());
					}
					
					for(i=0;i<n;i++)
					{
						SUM+=c[i];
					}
					avg=SUM/n;
					while(p!=n)
					{
						echo=echo*10+avg;
						p++;
					}
					 
						for(i=0;i<n;i++)
						{
							if(c[i]!=echo)
							{
								for(i=0;i<(n-1);i++)
								{
									for(j=0;j<((n-1)-i);j++)
									{
										if(c[j]<c[j+1])
										{
											temp=c[j];
											c[j]=c[j+1];
											c[j+1]=temp;
										}
									}
									sum=c[0]-1; Sum=c[n-1]+1;
								}
								System.out.println(" sum : "+sum+" Sum : "+Sum);
								co++;
								System.out.println(" CO : "+co);
								
							}
							
						}
					
					System.out.println("\nSteps Taken : "+co);
				}
				else
				{
					System.out.println("\nINVALID NUMBER OF CHOCOLATE PACKETS!!!");
				}
		
				t--;
			}while(t!=0);
		}
		else
			System.out.println("\nINVALID NUMBER OF TEST CASES!");
	}
}