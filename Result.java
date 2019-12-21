import java.util.Scanner;
class Result 
{
public static void main(String[] args)
{
Scanner venki=new Scanner(System.in);

int a=0,b=0,e=0,f=0;
float c=0,d=0;
int lit,lan;
int his,geo,phy,bio,chem;
int choice=0;
float per,total;

System.out.println("\nEnter your English Literature Marks:");
lit=venki.nextInt();
System.out.println("\nEnter your English Language Marks: ");
lan=venki.nextInt();
a=(lit+lan)/2;
System.out.println("\nYour English Marks are:"+a);

System.out.println("\nEnter your Mathematics Marks:");
b=venki.nextInt();

System.out.println("\nPress 1 for if you are Science Student\nPress 2 if you are Commerce Student");
choice=venki.nextInt();

switch(choice)
{
case 1: System.out.println("\nEnter your Biology Marks:");
		bio=venki.nextInt();
		System.out.println("\nEnter your Chemistry Marks");
		chem=venki.nextInt();
		System.out.println("\nEnter your Physics Marks:");
		phy=venki.nextInt();
		c=(bio+phy+chem)/3;
		System.out.println("\nYour Science Marks are:"+c);
break;

case 2: System.out.println("\nEnter your Economics Marks:");
		int eco=venki.nextInt();
		System.out.println("\nEnter your Statics Marks");
		int stat=venki.nextInt();
		System.out.println("\nEnter your Accountancy Marks:");
		int acc=venki.nextInt();
		c=(eco+stat+acc)/3;	
		System.out.println("\nYour Commerce Marks are:"+c);
break;
}

System.out.println("\nEnter your History marks:");
his=venki.nextInt();
System.out.println("\nEnter your Geography Marks:");
geo=venki.nextInt();
d=(his+geo)/2;
System.out.println("\nYour Social Studies Marks are:"+d);

System.out.println("\nEnter your Computer Marks:");
e=venki.nextInt();

System.out.println("\nEnter your Hindi Marks:");
f=venki.nextInt();

if(a<35)
	System.out.println("\nYou have Failed");
else if(b<35)
	System.out.println("\nYou have Failed");
else if(c<35)
	System.out.println("\nYou have Failed");
else if(d<35)
	System.out.println("\nYou have Failed");
else if(e<35)
	System.out.println("\nYou have Failed");
else if(f<35)
	System.out.println("\nYou have Failed");
else 
	System.out.println("\nCongractualtions You Have been Promoted to 9th Standard!");

total=a+b+c+d+e+f;
System.out.println("\nToatal="+total);
per=(a+b+c+d+e+f)*100/600;
System.out.println("\nPercentage="+per);


if(per>=90)
			System.out.println("\nGrade:A");
		else if(per>=70&&per<90)
			System.out.println("\nGrade:B");
		else if(per>=50&&per<70)
			System.out.println("\nGrade:C");
		else if(per<50)
			System.out.println("\nGrade:F");

if(a>b&&a>b&&a>c&&a>d&&a>e&&a>f)
	System.out.println("\nYou Have Scored Highest in English");
else if(b>a&&b>c&&b>d&&b>e&&b>f)
	System.out.println("\nYou Have Scored Highest in Mathematics");
else if(c>a&&c>b&&c>d&&c>e&&c>f)
	System.out.println("\nYou Have Scored Highest in Science");
else if(d>a&&d>b&&d>c&&d>e&&d>f)
	System.out.println("\nYou Have Scored Highest in Sst");
else if(e>a&&e>b&&e>c&&e>d&&e>f)
	System.out.println("\nYou Have Scored Highest in Computer Science");
else 
	System.out.println("\nYou Have Scored Highest in Hindi");

}
}