import java.io.*;
import java.lang.*;
import java.util.*;
class SUBSPLAY
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(venki.readLine());
		for(int T=0;T<t;T++)
		{
			int n=Integer.parseInt(venki.readLine());
			String s=venki.readLine();
			int i,j,k=0,z,c,m;
			String x="",y="";
			for(m=0;m<n;m++)
			{
				z=0;
				try
				{
					for(i=m;i<n;i++)
					{
						x=s.substring(m,i+1);
						//System.out.println("\nX : "+x);
						try
						{
							int M=m+1;
							for(j=i;j<n;j++)
							{
								if(x.length()==1)
								{
									j++;
									y=s.substring(j,j+z+1);
									//System.out.println("Y : "+y+"  I : "+i+"  J : "+j+" Z : "+z+" M : "+M+"  m : "+m);
									j--;
								}
								else if(x.length()>2)
								{
									y=s.substring(M,M+(x.length()));
									//System.out.println("Y : "+y+"  I : "+i+"  J : "+j+" Z : "+z+" M : "+M+"  m : "+m);
									M++;
								}
								else
								{
									y=s.substring(j,j+z+1);
									//System.out.println("Y : "+y+"  I : "+i+"  J : "+j+" Z : "+z+" M : "+M+"  m : "+m);
								}
								
								if(x.equals(y))
								{
									if(x.length()==y.length())
									{
										c=x.length();
										if(x.equals(y) && c>k)
											k=c;
										//System.out.println("\nMATCH FOUND!!~~ X = "+x+" ~~ Y : "+y+" ~~K : "+k);
									}
								}
							}
							z++;
						}
						catch (Exception e)
						{
							z++;
						}
					}
				}
				catch (Exception e)
				{

				}
			}
			System.out.println(k);
		}
	}
}