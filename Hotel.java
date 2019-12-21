import java.util.Scanner;
class Hotel
{
public static void main(String[] args)
{
Scanner venki=new Scanner(System.in);
int choice,hell;

System.out.println("\n**********Welcome to our Restaurant**********");

do
{
System.out.println("\n1.Starters\n2.Main Course\n3.Beverages and Ice Creams\nPlease Place our Order Dear Customer:");
choice=venki.nextInt();



if(choice==1)
{
System.out.println("\nWelcome to Starters menu");
switch(choice)
{
case 1: System.out.println("\nA.Soups\nB.Papads\nC.Chinese\nPress A for Soups and B for Papads and C for Chinese dishes:");
int menu=venki.next().charAt(0);

switch(menu)
{
case 'a':
case 'A': System.out.println("\n1.Manchow Soup- 75/-\n2.Baby corn Soup- 70/-\n3.Palak Soup-80/-\n4.Hot & Sour Soup- 80/-\n5.Mix Veggies Soup-85/-\nPlease Choose any of the above:");
int soup=venki.nextInt();

		switch(soup)
		{
			case 1: System.out.println("\nYou have selected Manchow soup please pay 75");
					int manch=75;
			break;
			case 2: System.out.println("\nYou have selected Baby Corn Soup please pay 70");
					int baby=70;
			break;
			case 3: System.out.println("\nYou have selected Palak Soup please pay 80/-");
					int palak=80;
			break;
			case 4: System.out.println("\nYou have now selected Hot and sour soup please pay 80/-");
					int hot=80;
			break;
			case 5: System.out.println("\nYou have now selected Mixed Veggies Soup please pay 85");
					int Mix=85;
					break;
			default: System.out.println("\nSorry Dear customer the soup is not available!");
			}
break;


case 'b':
case 'B': System.out.println("\n1.Masala Papad- 20/-\n2.Plain Papad- 10/-\n3.Tandoor Papad-15/-\nPlease choose any of the above:");
int papad=venki.nextInt();

switch(papad)
{
case 1: System.out.println("\nYou have selected Masala Papad...Please pay 20/-");
int masala=20;
break;
case 2: System.out.println("\nYou have selected Plain Papad please pay 10/-");
int plain=10;
break; 
case 3: System.out.println("\nYou have selected Tandoor Papad please pay 15/-");
int tandoor=15;
break;
default: System.out.println("\nSorry Dear customer the Papad is not available!");
}
break;


case 'c':
case 'C': System.out.println("\n1.Veg Manchurian- 90/-\n2.Paneer Chilli- 85/-\n3.Hakka Noodles-150/-\n4.Baby corn Manchurian- 115/-\n5.Fried Noodles- 125/-\nPlease choose any of the above:");

int chinese=venki.nextInt();

switch(chinese)
{
case 1: System.out.println("\nYou have selected Veg Manchurian please pay 90/-");
int Veg=90;
break;
case 2: System.out.println("\nYou have selected Paneer Chilli please 85/-");
int paneer=85;
break;
case 3: System.out.println("\nYou have now selected Hakka Noodles please pay 150/-");
int hakka=150;
break;
case 4: System.out.println("\nYou have now selected Baby corn Manchurian please pay 115/-");
int corn=115;
break;
case 5: System.out.println("\nYou have now selected Fried Noodles please pay 125/-");
int fried=125;
break;
default : System.out.println("\nThe Dish is not available!");
}
break;
}
}
}





else if(choice==2)
{
System.out.println("\nWelcome to Main Course");
switch(choice)
{
case 2: System.out.println("\nA.Roti\nB.Sabhji\nC.Rice\n Press A for Roti B for Sabhji and C for Rice:");
int menu=venki.next().charAt(0);

switch(menu)
{
case 'a':
case 'A': System.out.println("\n1.Tandoor Roti- 10/-\n2.Tandoor Roti with Butter- 15/-\n3.Naan- 20/-\n4.Culcha- 15/-\n5.Rumaal Roti- 25/-\nPlease choose any of the above:");
int roti=venki.nextInt();

switch(roti)
{
case 1: System.out.println("\nYou have selected Tandoor Roti please pay 10/-");
int tan=10;
break;
case 2: System.out.println("\nYou have selected Tandoor Roti with butter please pay 15/-");
int butter=15;
break;
case 3: System.out.println("\nYou have selected Naan Please pay 20/-");
int naan=20;
break;
case 4: System.out.println("\nYou have selcted Culcha Please pay 15/-");
int culcha=15;
break;
case 5: System.out.println("\nYou have selected Rumaal Roti please pay 25/-");
int rumal=25;
break;
default: System.out.println("\nSorry dear customer the Roti Is not available!");
}
break;


case 'b':
case 'B': System.out.println("\n1.Veg Kolhapuri- 190/-\n2.Veg Hundi- 200/-\n3.Dal Makhnai-195/-\n4.Mixed Vegetable Bhaji-210/-\n5.Panner Tikka masala- 225/-\nPlease choose any of the above:");
int sabhji=venki.nextInt();

switch(sabhji)
{
case 1: System.out.println("\nYou have selected Veg Kolhapuri please pay 190/-");
int kolhapuri=190;
break;
case 2: System.out.println("\nYou have selected Veg Hundi please pay 200/-");
int hundi=200;
break;
case 3: System.out.println("\nYou have selected Dal Makhnni please pay 195/-");
int dal=195;
break;
case 4: System.out.println("\nYou have selected Mixeed Vegetable Bhaji please pay 210/-");
int mixed=210;
break;
case 5: System.out.println("\nYou have selected Paneeer Tikka Masala please pay 225/-");
int tikka=225;
break;
default: System.out.println("\n The Sabhji is not available!");
}
break;


case 'c':
case 'C': System.out.println("\n1.Jeera Rice- 225/-\n2.Fried Rice- 220/-\n3.Schezwan Fried Rice- 210/-\n4.Veg Biryani- 250/-\n5.Plain Rice- 120/-\nPlease choose any of the above:");
int rice=venki.nextInt();

switch(rice)
{
case 1: System.out.println("\nYou have selected Jeera Rice please pay 225/-");
int jeera=225;
break;
case 2: System.out.println("\nYou have selected Fried Rice please pay 220/-");
int fry=220;
break;
case 3: System.out.println("\nYou have selected Schezwan Rice please pay210/-");
int Schezwan=210;
break;
case 4: System.out.println("\nYou have selected Veg Biryani please pay 250/-");
int biryani=250;
break;
case 5: System.out.println("\nYou have selected Plain Rice please pay 120/-");
break;
default: System.out.println("\n The Rice is Not available!");
}
break;
}
}
}
	


else if(choice==3)
{
System.out.println("\nWelcome to the menu of Beverages and Icecream");
switch(choice)
{
case 3: System.out.println("\nA.Beverages\nB.Ice Creams\n Press A for Beverages and B for Ice Creams:");
int menu=venki.next().charAt(0);

switch(menu)
{
case 'a':
case 'A': System.out.println("\n1.Tea-  25/-\n2.Coffe- 25/-\n3.Milk- 10/-\n4.Cold Coffe- 30/-\nPlease choose any of the above:");
int bev=venki.nextInt();

switch(bev)
{
case 1: System.out.println("\n You have selected Tea please pay 25/-");
int tea=25;
break;
case 2: System.out.println("\n You have selected Coffe please pay 25/-");
int coffe=25;
break;
case 3: System.out.println("\n3 You have selected Milk please pay 10/-");
int milk=10;
break;
case 4: System.out.println("\n You have selected Cold coffe please pay 30");
break;
default:System.out.println("\n The beverage is not available!");
} 
break;


case 'b':
case 'B': System.out.println("\n1.Mango Icecream- 10/-\n2.Vanilla Icecream- 10/-\n3.Sunday- 35/-\n4.Mixed Icecream- 45/-\n5.Mango jelly- 25/-\nPlease choose any of the above:");
int ice=venki.nextInt();

switch(ice)
{
case 1: System.out.println("\n You have selected Mango Ice cream please pay 10/-");
int mango=10;
break;
case 2: System.out.println("\n You have selected Vanilla Ice cream please pay 10/-");
int vailla=10;
break;
case 3: System.out.println("\n You have selected Sunday Ice cream please pay 35/-");
int sunday=35;
break;
case 4: System.out.println("\n You have selected Mixed Icecream please pay 45/-");
int cream=45;
break;
case 5: System.out.println("\n You have selected Mango jelly ice cream pay 25/-");
int jelly=25;
break;
default:System.out.println("\n The ice cream is not available!");
}
break;
}
}
}


else
{
System.out.println("\n Sorry Dear Customer your Choice could not be Granted!");
}
System.out.println("\nPress 1 to Exit 0 to continue");
hell=venki.nextInt();
}while(hell==0);

}
}
