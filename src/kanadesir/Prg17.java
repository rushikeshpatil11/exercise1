package kanadesir;

import java.util.Scanner;

public class Prg17 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your marks");
		int marks=sc.nextInt();
		if(marks>=70 && marks<=100)
			System.out.println("1st class with Distinction");
		else if(marks>=60 && marks<70)
			System.out.println("1st class ");
		else if(marks>=50 && marks<60)
			System.out.println("2nd class ");
		else if(marks>=35 && marks<50)
			System.out.println("3rd class ");
		else if(marks>=0 && marks<35)
			System.out.println("Failed...!!! ");
		else
			System.out.println("Invalid Marks");

	}

}
