import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class EID2
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		for(int t=0;t<T;t++)
		{
			StringTokenizer st=new StringTokenizer(venki.readLine());
			int a1=Integer.parseInt(st.nextToken());
			int a2=Integer.parseInt(st.nextToken());
			int a3=Integer.parseInt(st.nextToken());
			int c1=Integer.parseInt(st.nextToken());
			int c2=Integer.parseInt(st.nextToken());
			int c3=Integer.parseInt(st.nextToken());
			int bigb=0,midb=0,smallb=0,monb=0,monm=0,mons=0;
			if(a1>a2 && a1>a3) 
			{
				bigb=a1;
				monb=c1;
				if(a2>a3)
				{
					midb=a2;
					monm=c2;
					smallb=a3;
					mons=c3;
				}
				else
				{
					midb=a3;
					monm=c3;
					smallb=a2;
					mons=c2;
				}
			}
			else if(a2>a1 && a2>a3)
			{
				bigb=a2;
				monb=c2;
				if(a1>a3)
				{
					midb=a1;
					monm=c1;
					smallb=a3;
					mons=c3;
				}
				else
				{
					midb=a3;
					monm=c3;
					smallb=a1;
					mons=c1;
				}
			}
			else if(a3>a2 && a3>a1)
			{
				bigb=a3;
				monb=c3;
				if(a2>a1)
				{
					midb=a2;
					monm=c2;
					smallb=a1;
					mons=c1;
				}
				else
				{
					midb=a1;
					monm=c1;
					smallb=a2;
					mons=c2;
				}
			}
			else
			{
				if(a1==a2 && a2==a3)
				{
					bigb=a1;
					monb=c1;
					smallb=a2;
					midb=a3;
					mons=c2;
					monm=c3;
				}
				else if(a1==a2)
				{
					if(a1>a3)
					{
						bigb=a1;
						midb=a2;
						monb=c1;
						monm=c2;
						smallb=a3;
						mons=c3;
					}
					else
					{
						bigb=a3;
						midb=a2;
						smallb=a3;
						monb=c3;
						monm=c2;
						mons=c3;
					}	
				}
				else if(a1==a3)
				{
					if(a1>a2)
					{
						bigb=a1;
						midb=a3;
						monb=c1;
						monm=c3;
						smallb=a2;
						mons=c2;
					}
					else
					{
						bigb=a2;
						midb=a1;
						smallb=a3;
						monb=c2;
						monm=c1;
						mons=c3;
					}	
				}
				else if(a2==a3)
				{
					if(a1>a2)
					{
						bigb=a1;
						midb=a3;
						monb=c1;
						monm=c3;
						smallb=a2;
						mons=c2;
					}
					else
					{
						bigb=a2;
						midb=a3;
						smallb=a1;
						monb=c2;
						monm=c3;
						mons=c1;
					}	
				}
			}
			if(monb>monm && monb>mons && monm>mons && (bigb!=midb && midb!=smallb && smallb!=midb))
			{
				System.out.println("FAIR");
			}
			else if((bigb==midb && midb==bigb && midb==smallb))
			{
				if((monb==monm && monm==mons && mons==monb))
					System.out.println("FAIR");
				else
					System.out.println("NOT FAIR");
			}
			else if(bigb==midb && midb>smallb)
			{
				if(monb==monm && monb>mons)
					System.out.println("FAIR");
				else
					System.out.println("NOT FAIR");
			}
			else if(midb==smallb && bigb>midb)
			{
				if(monm==mons && monb>monm)
					System.out.println("FAIR");
				else
					System.out.println("NOT FAIR");
			}
			else
			{
				System.out.println("NOT FAIR");
			}
		}
	}
}