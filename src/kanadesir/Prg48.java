package kanadesir;

import java.util.Scanner;

public class Prg48 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre any number");
		int num=sc.nextInt();
		int num1=num;
		int rem,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(num1==rev)
			System.out.println("Given number is Palindrome Number");
		else
			System.out.println("Given number is Not Palindrome Number");
			

	}

}
