/* Program to read a floating number and print a small number not less the number & given number & largest
 number not greater than the number */
 import java.io.*;
 import java.lang.*;
 class GreatSmallGiv
 {
	 public static void main(String []args) throws IOException
	 {
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		float n;
		System.out.println("\nEnter a Floating number :");
		n=Float.parseFloat(venki.readLine());
		System.out.println("\nSmaller number not greater than the entered number :" + Math.ceil(n));
		System.out.println("\nGiven number : "+n);
		System.out.println("\nGreater number not greater than the entered number :" + Math.floor(n));
	 }
 }