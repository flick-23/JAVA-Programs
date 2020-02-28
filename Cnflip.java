import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;
class Cnflip
{	
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		int G=Integer.parseInt(venki.readLine());
		int i,h=0,t=0;
		while(T!=0)
		{
			if(1<=G&&G<=20000)
			{
				while(G!=0)
				{
					StringTokenizer st=new StringTokenizer(venki.readLine());
					int I=Integer.parseInt(st.nextToken());
					long N=Long.parseLong(st.nextToken());
					int Q=Integer.parseInt(st.nextToken());
					if((1<=N&&N<=(Math.pow(10,9)))&&(1<=I&&I<=2)&&(1<=Q&&Q<=2))
					{
						h=0;t=0;
						switch(I)
						{
						case 1: for(i=1;i<=N;i++)
								{
								if(i%2==0)
									h++;
								else
									t++;
								}
								break;
						
						case 2: for(i=1;i<=N;i++)
								{
									if(i%2==0)
										t++;										
									else
										h++;
								}
						break;
								
						}	
					}
					if(Q==1)
					System.out.println("\n"+h+"\n");
					if(Q==2)
					System.out.println("\n"+t+"\n");
					G--;
				}
			}
		T--;
		}
	}
}