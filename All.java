import java.util.Scanner;
class All
{
	public static void main(String[] args)
	{
		Scanner venki=new Scanner(System.in);
		int a=0,b=0,i=0,j=0,f1=0,f2=1,f3=0,f=0,v;
		int temp=0,arm=0,n=0,rev=0,r=0,rem=0;
		int sum,product,avg,diff,sq;
		float quotient=0;
		int tab=0,c=0,d=0,e=0,g=0,h=0,t=0;
		long cu,remainder;
		do
		{
		
		System.out.println("\nChoose Any one of The Following From Below:\n\n1.Even Numbers\t2.Odd Numbers\t3.Fibbonacci \t4.Factorail Number\n5.Armstrong \t6.Palindrome\t7.Reverse\t8.Addition\n9.Subtraction\t10.Product\t11.Division\t12.Average\n13.Square\t14.Cube\t\t15.Square root\t16.Cube Root\n17.Tables\n18.Evil Number\t19.Magic Number");
		int choice=venki.nextInt();
		
		switch(choice)
		{
			case 1: System.out.println("\nEven Numbers till 200 are:");
					for(i=0;i<=200;i++)
						if(i%2==0)
								System.out.println("\n"+i);
			break;
			case 2: System.out.println("\nOdd Numbers till 200:");
					for(j=0;j<=200;j++)
						if(j%2!=0)
							System.out.println("\n"+j);
			break;
			case 3: System.out.println("\nEnter the Range of Fibbonacci Series:");
					int num=venki.nextInt();
					System.out.println("\nThe Fibbonacci Series is:");
					System.out.println("\n"+f1);
					System.out.println("\n"+f2);
					
					for(f=0;f<num;f++)
					{
						f3=f1+f2;
						f1=f2;
						f2=f3;
						System.out.println("\n"+f3);
					}
			break;
			case 4: System.out.println("\nEnter The Number To be Factorised:");
					b=venki.nextInt();
					int b1;
					b1=b-1;
					while(b1>0)
					{
						b=b*b1;
						b1--;
					}
                    System.out.println("\nFactorial Of the Number is:"+b);
            break;
			case 5: System.out.println("\nEnter a Number:");
					num=venki.nextInt();
					
					temp=num;
					while(num!=0)
					{
						rem=num%10;
						arm=arm+(rem*rem*rem);
						num=num/10;
					}
					if(arm==temp)
						System.out.println("\nIt is an Armstrong Number");
					else
						System.out.println("\nIt is Not an Armstrong Number!");
					break;
			case 6: System.out.println("\nEnter a Number:");
					n=venki.nextInt();
					temp=n;
					while(n!=0)
					{
						r=n%10;
						rev=rev*10+r;
						n=n/10;
					}
					System.out.println("\nReverse of the Given Number is:"+rev);
					if(rev==temp)
						System.out.println("\nIt is a Palindrome Number");
					else 
						System.out.println("\nIt is not a Palindrome Number");
					break;
			case 7: System.out.println("\nEnter a Number:");
					n=venki.nextInt();
					rev=0;
					r=0;
					while(n!=0)
					{
					    r=n%10;
						rev=rev*10+r;
						n=n/10;
					}
					System.out.println("\nReverse Of the Number is:"+rev);
			break;
			case 8: System.out.println("\nEnter The Value of First Number:");
					a=venki.nextInt();
					System.out.println("\nEnter The Value of Second Number:");
					b=venki.nextInt();
					sum=a+b;
					System.out.println("\nThe Sum of the Numbers Entered are:"+sum);
					
			break;
			case 9: System.out.println("\nEnter The Value of First Number:");
					a=venki.nextInt();
					System.out.println("\nEnter The Value of Second Number:");
					b=venki.nextInt();
					diff=a-b;
					System.out.println("\nThe Difference of The Numbers Entered is:"+diff);
					
			break;
			case 10: System.out.println("\nEnter The Value of First Number:");
					 a=venki.nextInt();
					 System.out.println("\nEnter The Value of Second Number:");
					 b=venki.nextInt();
					  product=a*b;
					 System.out.println("\nThe product of the Numbers Entered are:"+product);
					
			break;
			case 11: System.out.println("\nEnter The Value of First Number:");
					 a=venki.nextInt();
					 System.out.println("\nEnter The Value of Second Number:");
					 b=venki.nextInt();
					  quotient=(float)a/b;
					  remainder=a%b;
					 System.out.println("\nThe quotient of the Numbers Entered are:"+quotient);
					 System.out.println("\nThe Remainder of the Numbers Entered is :"+remainder);
					
			break;
			case 12: System.out.println("\nEnter The Value of First Number:");
					 a=venki.nextInt();
					 System.out.println("\nEnter The Value of Second Number:");
					 b=venki.nextInt();
					  avg=(a+b)/2;
					  sum=a+b;
					  System.out.println("\nThe Sum of The Numbers Entered is:"+sum);
					 System.out.println("\nThe Average of the Numbers Entered are:"+avg);
					
			break;
			case 13: System.out.println("\nEnter a Number to Squared");
					 a=venki.nextInt();
					 sq=(a*a);
					 System.out.println("\nThe Square of the Number Entered is:"+sq);
			break;
			case 14: System.out.println("\nEnter a Number to Cubed:");
					 b=venki.nextInt();
					 cu=(b*b*b);
					 System.out.println("\nThe Cube of the Entered Number is:"+cu);
			break;
			case 15: double nu;
					 System.out.println("\nEnter a Number for which you want Square Root:");
					 nu=venki.nextInt();
					 nu=Math.sqrt(nu);
					 System.out.println("\nSquare Root:"+nu);
			break;
			case 16: double number;
					 System.out.println("\nEnter a Number for which you want Cube root:");
					 number=venki.nextInt();
					 number=Math.cbrt(number);
					 System.out.println("\nCube Root:"+number);
			break;
			
			case 17: System.out.println("\nEnter a number for it's First 10 Multiples:");
					 i=venki.nextInt();
		
					for(n=1;n<=10;n++)
					{
						a=i*n;
						System.out.println("\n"+a);
					}
					
			break;
			
			default: System.out.println("\nINVALID CHOICE!");
		}
		System.out.println("\nPress 1 to Continue 0 to EXIT");
		 v=venki.nextInt();
		}while(v!=0);
	}
}