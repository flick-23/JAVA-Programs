import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;
class CeiAb
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(venki.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int s=0,s1=0,s2=0,s3=0,s4=0;
		if(1<=B&&B<A&&A<=10000)
		{
			s=(A-B);
			s1=s+1; s2=s-2000; s3=s-1; s4=s-20;
		}
		System.out.println("\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4);
	}
}