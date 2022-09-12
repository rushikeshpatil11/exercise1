package kanadesir;

import java.util.Scanner;

public class Prg21 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any year");
		int year=sc.nextInt();
		if(year%4==0) {
			if(year%100!=0 && year%400==0)
			System.out.println("Given Year is Leap Year");}
		else
			System.out.println("Given Year is Not Leap Year");
			
	}

}
