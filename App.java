import java.io.*;
import java.lang.*;
import java.util.*;
class App
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(venki.readLine());
		for(int T=0;T<t;T++)
		{
			String s=venki.readLine();
			int i,j,k=0,z,c,m,n=s.length();
			String x="",y="";
			for(m=0;m<n;m++)
			{
				z=0;
				try
				{
					for(i=m;i<n;i++)
					{
						x=s.substring(m,i+1);
						System.out.println("\nX : "+x);
						try
						{
							int M=m+1;
							for(j=i;j<n;j++)
							{
								if(x.length()==1)
								{
									j++;
									y=s.substring(j,j+z+1);
									System.out.println("Y : "+y+"  I : "+i+"  J : "+j+" Z : "+z+" M : "+M+"  m : "+m);
									j--;
									if(m==0)
									{
										char ch=y.charAt(0);
										if(ch=='A' ||ch=='U' ||ch=='I' ||ch=='E' ||ch=='O' ||ch=='o' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='u')
										{
											k++;
										}
									}
								}
								else if(x.length()>2)
								{
									y=s.substring(M,M+(x.length()));
									System.out.println("Y : "+y+"  I : "+i+"  J : "+j+" Z : "+z+" M : "+M+"  m : "+m);
									M++;
								}
								else
								{
									y=s.substring(j,j+z+1);
									System.out.println("Y : "+y+"  I : "+i+"  J : "+j+" Z : "+z+" M : "+M+"  m : "+m);
								}
								
							}
							if(y.length()!=1)
							{
								for(int e=0;e<y.length();e++)
								{
									char ch=y.charAt(e);
									if(ch=='A' ||ch=='U' ||ch=='I' ||ch=='E' ||ch=='O' ||ch=='o' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='u')
									{
										k++;
									}
								}

							}
							if(m==0)
							{
								char ch=y.charAt(0);
								if(ch=='A' ||ch=='U' ||ch=='I' ||ch=='E' ||ch=='O' ||ch=='o' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='u')
								{
									k++;
								}
							}
							z++;
						}
						catch (Exception e)
						{
							z++;
						}
					}
					for(int e=0;e<x.length();e++)
					{
						char ch=x.charAt(e);
						if(ch=='A' ||ch=='U' ||ch=='I' ||ch=='E' ||ch=='O' ||ch=='o' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='u')
						{
							k++;
						}
					}
					System.out.println("K : "+k);

				}
				catch (Exception e)
				{

				}
			}
			System.out.println(k);
		}
	}
}