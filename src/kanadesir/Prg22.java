package kanadesir;

import java.util.Scanner;

public class Prg22 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age,Exprience and 12th Marks");
		int age=sc.nextInt();
		int exp=sc.nextInt();
		int marks=sc.nextInt();
		
		if(age>40 && exp>10 && marks>60)
			System.out.println("Your are eligible for This Position");
		else
			System.out.println("Your are Not eligible for This Position");

	}

}
