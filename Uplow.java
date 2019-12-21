import java.lang.*;
import java.io.*;
class Uplow //Pg 112
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		String sen;
		int choice,up=0,lo=0,vo=0;
		
		System.out.println("\nEnter a Sentence :");
		sen=venki.readLine();
		int leng=sen.length();

		for(int i=0;i<leng;i++)
		{
			int chr=(sen.charAt(i));
			if(Character.isUpperCase(chr))
			up+=1;
		}
		System.out.println("\nCounting...!");
		System.out.println("\nNumber of Upper Case Characters : "+up);
		
		for(int j=0;j<leng;j++)
		{
			int chr1=(sen.charAt(j));
			if(Character.isLowerCase(chr1))
				lo+=1;
		}
		System.out.println("\nNumber of Lower Case Characters : "+lo);
		
		for(int k=0;k<leng;k++)
		{
			int chr2=(sen.charAt(k));
			if((chr2=='A')||(chr2=='E')||(chr2=='O')||(chr2=='U')||(chr2=='I')||(chr2=='a')||(chr2=='e')||(chr2=='i')||(chr2=='o')||(chr2=='u'))
				vo+=1;
		}
		System.out.println("\nNumber of Vowels : "+vo);
		
	}
}