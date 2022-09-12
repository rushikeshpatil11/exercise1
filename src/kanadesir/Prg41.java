package kanadesir;

import java.util.Scanner;

public class Prg41 {

	public static void main(String[] args) {
		char choice;
		int count=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter any number");
			int num=sc.nextInt();
			if(num>=0)
				System.out.println("Given number is Positive");
			else
				System.out.println("Given number is Negative");
			System.out.println("Continue y/n");
			choice=sc.next().charAt(0);
			count++;
		}while((choice=='y'|| choice=='Y') && (count<10));
		
		System.out.println("Thanku..You Cross the Limit.!!!");

	}

}
