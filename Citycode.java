import java.io.*;
import java.lang.*;
class Citycode
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		String city[]=new String[20],sea_city;
		int code[]=new int[20],i,j,sea_code,flag=0,flag1=0;
		
		System.out.println("\nEnter 5 City's name & Code....");
		for(i=0;i<5;i++)
			{
				System.out.println("\n\nEnter the City's name : ");
				city[i]=venki.readLine();
				System.out.println("\nEnter the City's Code:");
				code[i]=Integer.parseInt(venki.readLine());
				System.out.println();
			}
			
			System.out.println("\nPress '1' to enter the code and check city's name OR Press '2' to Enter city and check code!");
			int choice=Integer.parseInt(venki.readLine());
			
			switch(choice)
			{
				case 1: System.out.println("\nEnter the Code:");
						 sea_code=Integer.parseInt(venki.readLine());
						 for(i=0;i<5;i++)
						 {
							 if(code[i]==sea_code)
							 {
								 System.out.println("\n"+city[i]);
							
							 }
						 }
							
				break;
				case 2: System.out.println("\nEnter the City : ");
					    sea_city=venki.readLine();
						for(i=0;i<5;i++)
						{
							if(sea_city.equals(city[i]))
							{
								System.out.println("\n"+code[i]);
						
							}
						}
							
				break;
				default: System.out.println("\nWRONG CHOICE!");			
			}
	}
}