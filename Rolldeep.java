import java.io.*;
import java.lang.*;
class Rolldeep
{public static void main(String[]args) throws IOException
	{BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String S=venki.readLine();
		char c=40,c1=41,ch;
		int i,p=0,p1=0;
		if((S.length()>=1&&S.length()<=100))
		{for(i=0;i<S.length();i++)
			{ch=S.charAt(i);
				switch(ch)
				{case '(' : p=i;
				break;
				}}for(i=p;i<S.length();i++){
				if(S.charAt(i)==c1)
				{p=i;
					break;}}
			for(i=(p+1);i<(p1);i++)
			{
				if((S.charAt(i)>=65&&S.charAt(i)<=90)||(S.charAt(i)>=97&&S.charAt(i)<=122)||(S.charAt(i)==32))
					System.out.print(S.charAt(i));
			}}}}