import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class WEIRDO
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(venki.readLine());
		for(int T=0;T<t;T++)
		{
			int L=Integer.parseInt(venki.readLine());
			int i,j,c,n=0,m=0,x,f;
			String alice[]=new String[100000],bob[]= new String[100000];
			String al="",bb="",s;
			double sca=1,scb=1;float F;
			for(i=0;i<L;i++)
			{
				int V=0,C=0;
				s=venki.readLine();
				for(j=0;j<s.length();j++)
				{
					char ch=s.charAt(j);
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
						V++;
					else
						C++;
				}
				if(V>=C)
				{
					alice[n]=s;
					al=al+s+" ";
					n++;
				}
				else
				{
					bob[m]=s;
					bb=bb+s+" ";
					m++;
				}
			}
			c=0;al+=" ";bb+=" ";
			for(char ch='a';ch<='z';ch++)
			{
				char chr;
				x=0;f=0;
				for(i=0;i<al.length();i++)
				{
					chr=al.charAt(i);
					if(chr==ch)
					{
						x++;
						f++;
						while(chr!=' ')
						{
							i++;
							chr=al.charAt(i);
							if(chr==ch)
								f++;
						}
					}
				}
				//System.out.println("ALICE_CHR:"+ch+"\tALICE_X:"+x+"\tALICE_F:"+f);
				F=(float)Math.pow(f,n);
				//System.out.println("F :"+F);
				if(F>0 && x>0)
					sca=sca*(x/F);
				x=0;f=0;
				for(i=0;i<bb.length();i++)
				{
					chr=bb.charAt(i);
					if(chr==ch)
					{
						x++;
						f++;
						while(chr!=' ')
						{
							i++;
							chr=bb.charAt(i);
							if(chr==ch)
								f++;
						}
					}
				}
				//System.out.println("BOB_CHR:"+ch+"\tBOB_X:"+x+"\tBOB_F:"+f);
				F=(float)Math.pow(f,n);
				//System.out.println("F :"+F);
				if(F>0 && x>0)
					scb=scb*(x/F);
			}
			float r=(float)(sca/scb);
			if(r>10000000)
				System.out.println("Infinity");
			else
				System.out.printf("%.7f",r);
			System.out.println();
		}
	}
}