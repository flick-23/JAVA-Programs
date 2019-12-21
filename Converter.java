import java.util.Scanner;
class Converter
{
	public static void main(String args[]) //Page- 122 
	{
		Scanner venki=new Scanner (System.in);
		int choice;
		double b,t=0;
		/*1 pound= 86 /-  1 Euro = 71/- 1 Dollar = 63/- */
		
		System.out.println("\n1.Convert Kb into Bytes\n2.Convert Mb to Kb\n3.Convert Gb to Mb\n4.Convert Tb to Gb");
		System.out.println("\n5.Convert Centimetre to Millimetre\n6.Metre to Centimetre\n7.Convert Kilometre to Metre\n8.Covert Metre To Inch");
		System.out.println("\n9. Rupee To Paise\n10.Dollars To Rupees\n11.Euros To Rupees\n12.Pounds To Rupees");
		choice=venki.nextInt();
		
		switch(choice)
		{
			case 1: System.out.println("\nEnter The Amount in Kilo Bytes:");
					b=venki.nextInt();
					t=b*1024;
					System.out.println(+b+" Kilo Bytes are Equal to:  "+t+" Bytes");
			break;
			
			case 2: System.out.println("\nEnter The Amount In Mega Bytes:");
					b=venki.nextInt();
					t=b*1024;
					System.out.println(+b+" Mega Bytes are Equal To: "+t+ " KB");
			break;
			
			case 3: System.out.println("\nEnter The Amount in Giga Bytes:");
					b=venki.nextInt();
					t=b*1024;
					System.out.println(+b+" Giga Byte's are Equal To: "+t+" MB");
			break;
			
			case 4: System.out.println("\nEnter The Amount in Tera Bytes:");
					b=venki.nextInt();
					t=b*1024;
					System.out.println(+b+" Tera Byte's are Equal To: "+t+" GB");
			break;		
					
			case 5: System.out.println("\nEnter The Amount in Cm:");
					b=venki.nextInt();
					t=b*10;
					System.out.println(+b+" Centimetres = "+t+" Millimetres");
			break;
			
			case 6: System.out.println("\nEnter The Amount in Metres:");
					b=venki.nextInt();
					t=b*100;
					System.out.println(+b+" Metres ="+t+" Centimetres");
			break;
			
			case 7: System.out.println("\nEnter The Amount in Kilometres:");
					b=venki.nextInt();
					t=b*1000;
					System.out.println(+b+" Kilometres ="+t+" Metres");
			break;
			
			case 8: System.out.println("\nEnter The Amount in Metres:");
					b=venki.nextInt();
					t=b*39.34;
					System.out.println(+b+" Metres ="+t+" Inch");
			
			case 9: System.out.println("\nEnter The Amount in Rupees:");
					b=venki.nextInt();
					t=b*100;
					System.out.println(+b+" Rupees = "+t+" Paise");
			break;
			
			case 10: System.out.println("\nEnter The Amount in Dollars:");
					b=venki.nextInt();
					t=b*63;
					System.out.println(+b+" Dollars = "+t+" Rupees");
			break;
			
			case 11: System.out.println("\nEnter The Amount in Euros:");
					 b=venki.nextInt();
					 t=b*100;
					 System.out.println(+b+" Euros = "+t+" Rupee(s)");
			break;
			
			case 12: System.out.println("\nEnter The Amount in Pounds:");
					 b=venki.nextInt();
					 t=b*86;
					 System.out.println(+b+" Pounds = "+t+" Rupee(s)");
			break;
		}
	}
}