package kanadesir;

import java.util.Scanner;

public class Prg44 {

	public static void main(String[] args) {
		int rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
          System.out.println("Reverse number is:=" +rev);
	}

}
