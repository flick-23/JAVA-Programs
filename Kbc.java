import java.io.*;
import java.lang.*;
class Kbc
{
	public static void main(String[]args)throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader venki=new BufferedReader(read);
		
		int temp,temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8,temp9,temp10,temp11,temp12,temp13,temp14;
		int ans,ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,ans11,ans12,ans13,ans14;
		int game;
	
		
		System.out.println("\n\n**********Welcome To Kaun Banega Maha CrorePati**********:");
		System.out.println("\nHere Are The Rules And Regulations:\n1.You Will Be Asked 15 Questions\n2.The Price For Each Question Is Mentioned Above The Question");
		System.out.print("3.If You Fail To Give The Right Answer In ONE Attempt you will loose the game and win Only the amount you won for previous question\n4.You DONT have any LIFELINE!");
		System.out.println("\nPress 1 to Play the Game:");
		game=Integer.parseInt(venki.readLine());
		
		System.out.println("\n!!!!HERE THE GAME BEGINS!!!!");
	
		System.out.println("\nThe First Question on your Screen is for 5000/-\n\nThe SI unit of Power\n\n1.Joule\n\n2.Newton\n\n3.Ampere\n\n4.Watt");
		ans=Integer.parseInt(venki.readLine());
		switch(ans)
		{
			case 4: System.out.println("\nCongratulations You Have Won 5000/-");
			break;
			default: System.out.println("\nWRONG CHOICE!\nYOU LOST");
		}
		
		System.out.println("\nNext Question for 10000/- on your Screen Now\n\n In India Windows 8 was Released in the Year\n\n1.2010\n\n2.2011\n\n3.2012\n\n4.2013");
		ans1=Integer.parseInt(venki.readLine());
		switch(ans1)
		{
			case 3:  System.out.println("\nCongratulations You Have Won 10000/-");
			break;
			default: System.out.println("\nWRONG CHOICE!\nYOU LOST");
		}
		

		
		
	}
}