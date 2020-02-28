import java.io.*;
import java.lang.*;
class Color
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int i,r,g,b,stp,sum;
		int t=Integer.parseInt(venki.readLine());
		if(t>=1&&t<=10)
		{
			while(t-->0)
			{
				sum=0;r=0;b=0;g=0;stp=0;
				int n=Integer.parseInt(venki.readLine());
				String s=venki.readLine();
				char ch;
				for(i=0;i<n;i++)
				{
					switch(s.charAt(i))
					{
						case 'B': b++;
						break;
						case 'G': g++;
						break;
						case 'R': r++;
						break;
					}
				}
				System.out.println("\nR:"+r+"\nG:"+g+"\nB:"+b);
				if(r>g&&r>b)
					stp=g+b;
				else if(g>r&&g>b)
					stp=r+b;
				else if(b>g&&b>r)
					stp=g+r;
				System.out.println(stp);
			}
		}
		else
			System.out.println("");
	}
}