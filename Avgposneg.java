import java.io.*;
class Avgposneg
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int a[]=new int[100],i,spo=0,sne=0,c=0,c1=0;
		System.out.println("\nEnter the number of elements in the Array : ");
		int n=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the of elements of the Array : ");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(venki.readLine());
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0){
				sne=sne+a[i]; c++;
				
			}if(a[i]>0){
				spo=spo+a[i];c1++;
			}
		}
		double avg_ne=0,avg_pos=0;
		avg_ne=(double)sne/c;
		avg_pos=(double)spo/c1;
		System.out.println("\nThe Average of Positive Numbers : "+avg_pos);
		System.out.println("\nThe Average of Negative Numbers : "+avg_ne);
	}
}