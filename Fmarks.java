//WAP To Calculate the marks of a Phoenix Student Using 
/*(i)    A parameterised  constructor to initialise the data members*
  (ii)   To accept the details of  a student 
  (iii)  To compute average marks, percentage,*/ 
import java.io.*;
import java.lang.*;
class Fmarks
{
	String name;
	int  En1,En2,Mat,Cc,Pc,Ba,Hs,Ge,Cpf,Hk,Max;
	long Eng,Sc,St,tot;
	double per; String Nam;
	
	Fmarks(String n,int E1,int E2,int MAT,int PC,int CC,int BA,int HK,int CPF,int HS,int GE)
	{
		Nam=n;
        En1=E1;   En2=E2;
		Mat=MAT;  Pc=PC;  Cc=CC;  Ba=BA;
		Hk=HK;
		Cpf=CPF;
		Hs=HS;    Ge=GE;
	}
	void calc()
	{
		Eng=(En1+En2)/2;
		Sc=(Pc+Cc+Ba)/3;
		St=(Hs+Ge)/2;
		tot=Eng+Sc+St+Mat+Hk+Cpf;
		per=tot/6;
	}
	 void display()
	{
		System.out.println("\n\n****************MARKS********************");System.out.println("\n");
		System.out.println("\nName of Student : "+Nam);System.out.println();
		System.out.println("\nEnglish           : "+Eng);
		System.out.println("\nMath              : "+Mat);
		System.out.println("\nScience/Commerce  : "+Sc);
		System.out.println("\nSocial Studies    : "+St);
		System.out.println("\nHindi/Kanada      : "+Hk);
		System.out.println("\nComputer/P.E/Arts : "+Cpf);
		System.out.println("\n\n\n");
		if((Eng<35)||(Mat<35)||(Sc<35)||(St<35)||(Hk<35)||(Cpf<35))
		{
			System.out.println("\nFAIL !");
		}
		else
		{
			System.out.println("\nPASS!");
		}
		System.out.println("Total      :"+tot);
		System.out.println("Percentage :"+per);
	}
	
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int ag,e1,e2,E,pc=0,cc=0,ba=0,SC,mat=0,hs,ge,ST,hk=0,cpf=0;
		String nam;
		System.out.println("\nEnter your name : ");
		nam=venki.readLine();
		
		System.out.println("\nEnter your English Language Marks  :");
		e1=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter your English Literature Marks:");
		e2=Integer.parseInt(venki.readLine());
		
		System.out.println("\nPress 1 if you are Science Student or 2 If you are Commerce Student !");
		int sc=Integer.parseInt(venki.readLine());
		
		switch(sc)
		{
			case 1 : System.out.println("\nEnter your Mathematics Marks :");
					 mat=Integer.parseInt(venki.readLine());
					 System.out.println("\nEnter your Physics Marks     :");
					 pc=Integer.parseInt(venki.readLine());
					 System.out.println("\nEnter your Chemistry Marks   :");
					 cc=Integer.parseInt(venki.readLine());
					 System.out.println("\nEnter your Biology Marks     :");
					 ba=Integer.parseInt(venki.readLine());
			break;
			
			case 2: System.out.println("\nEnter your Statistics Marks         :");
					mat=Integer.parseInt(venki.readLine());
					System.out.println("\nEnter your Economics Marks          :");
					pc=Integer.parseInt(venki.readLine());
					System.out.println("\nEnter your Commercial Studies Marks :");
					cc=Integer.parseInt(venki.readLine());
					System.out.println("\nEnter your Accountancy Marks        :");
					ba=Integer.parseInt(venki.readLine());
			break;
			default: System.out.println("\nINVALID CHOICE!");
		}
		
		System.out.println("\nPress 1 if you are Hindi OR 2 if you are Kannada!");
		int hK=Integer.parseInt(venki.readLine());
		switch(hK)
		{
			case 1 : System.out.println("\nEnter your Hindi Marks   :");
					 hk=Integer.parseInt(venki.readLine());
			break;
			case 2 : System.out.println("\nEnter your Kannada Marks :");
					 hk=Integer.parseInt(venki.readLine());
			break;
			default : System.out.println("\n INVALID CHOICE!");
		}
		
		System.out.println("\nPress 1 if you are Computer Students OR 2 if you are P.E Student OR Press 3 for Fine Arts");
		int cpF=Integer.parseInt(venki.readLine());
	    switch(cpF)
		{
			case 1: System.out.println("\nEnter your Computer Marks  :");
					cpf=Integer.parseInt(venki.readLine());
			break;
			case 2: System.out.println("\nEnter your P.E Marks       :");
			        cpf=Integer.parseInt(venki.readLine());
			break;
			case 3: System.out.println("\nEnter your Fine Arts Marks :");
					cpf=Integer.parseInt(venki.readLine());
			break;
			default: System.out.println("\nINVALID CHOICE!");
		}
		
		System.out.println("\nEnter your History & Civics Marks :");
		hs=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter your Geography Marks        :");
		ge=Integer.parseInt(venki.readLine());
		
		Fmarks obj=new Fmarks(nam,e1,e2,mat,pc,cc,ba,hk,cpf,hs,ge);
		obj.calc();
		obj.display();
	}
}