import java.io.*;
import java.lang.*;
class Pythtriplet
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int s1,s2,hp,pt=0;

		System.out.println("\nPythagorean Triplets : ");
		 for(s1=0;s1<=100;s1++)
		 {
			 for(s2=0;s2<=100;s2++)
			 {
				 for(hp=1;hp<=100;hp++)
				 {
					pt=(s1*s1)+(s2*s2);
					hp=(hp*hp);
				 }
				 if(hp==pt)
				 {
					 System.out.println("\n("+s1+","+s2+","+hp+")");
				 }
			 }
		 }
		
	}
}