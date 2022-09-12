package kanadesir;

import java.util.Scanner;

public class Prg46 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int max=num%10;
		int min=num%10;
int rem,sum=0,rev=0;
		while(num!=0)
		{
			rem=num%10;
			System.out.println(rem);
			if(rem>max)
				max=rem;
			else if(rem<min)
				min=rem;
			rev=rev*10+rem;
			sum=sum+rem;
			num=num/10;
		}
System.out.println("Addition of All Digits is:= "+sum);
System.out.println("Reverse  Digits is:= "+rev);
System.out.println("Maximum Digit is:= "+max);
System.out.println("Minimum Digit is:= "+min);


	}

}
