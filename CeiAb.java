import java.io.*;
import java.util.StringTokenizer;
class CeiAb
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in()));
		StringTokenizer st=new StringTokenizer(venki.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		if(1<=B&&B<A&&A<=10000)
		{
			int s=(A-B)+5;
		}
	}
}