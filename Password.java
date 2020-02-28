import java.lang.*;
import java.io.*;
class Password
{public static void main(String[]args)throws IOException
	{BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int te=0;
			do
			{
				int f=0,c=0,i,t=0;
				char ch;
			String str=venki.readLine();
			int l=str.length();
			if(1<=l&&l<=100)
			{
				for(i=0;i<l;i++)
				{
					ch=str.charAt(i);
					if((ch>='a') && (ch<='z')) 
					{
						c++;
					}
					if((ch>=48) && (ch<=57))
					{
						f++;	
					}
				}
				if((f>1)&&(c>1))
					t=f+c;
				if(t==l)
				{
					System.out.println("\nValid");
					te=1;
				}
				else
				{
					System.out.println("\nInvalid");
				}
				if(te==1)
					break;
				else
					continue;
			}
		}while(te!=1);
	}
}