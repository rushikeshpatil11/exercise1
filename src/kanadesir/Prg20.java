package kanadesir;

import java.util.Scanner;

public class Prg20 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println("Given number is Even");
			else
				System.out.println("Given number is Odd");
				
	}

}
