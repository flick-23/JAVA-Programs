import java.io.*;
class Exam
{
	protected static void main(String []args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int roll[]=new int [5],avg[]=new int[5];
		int i,j,k,eng,sci,comp;
					
		System.out.println("\nEnter the roll number of the Student : ");
		for(i=0;i<5;i++)
		{
			roll[i]=Integer.parseInt(venki.readLine());
			System.out.println("\nEnter English Marks out of 80 :");
			eng=Integer.parseInt(venki.readLine());
			System.out.println("\nEnter Science Marks out of 80 : ");
			sci=Integer.parseInt(venki.readLine());
			System.out.println("\nEnter Computer Marks out of 80:");
			comp=Integer.parseInt(venki.readLine());
			avg[i]=(sci+eng+comp/3);
			System.out.println("\nAverage Marks : "+avg[i]);
			System.out.println("\nEnter the roll number of the next Student : ");
		}
		System.out.println("\nAverage Marks above 80  : ");
		for(j=0;j<5;j++)
		{
			if(avg[j]>80)
			{
				System.out.println(roll[j]+". "+avg[j]);
			}
			System.out.println("\n Average Marks Below 80 : ");
			for(k=0;k<5;k++)
			{
				if(avg[k]<80)
				{
					System.out.println(roll[k]+". "+avg[k]);
				}
			}
		}
	}
}