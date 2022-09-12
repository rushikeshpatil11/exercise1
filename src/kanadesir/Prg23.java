package kanadesir;

import java.util.Scanner;

public class Prg23 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any two Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter 1 for Addition ");
		System.out.println("Enter 2 for Substraction ");
		System.out.println("Enter 3 for Multiplication ");
		System.out.println("Enter 4 for Division ");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Addition is:= " +(num1+num2));
			break;
		case 2:
			System.out.println("Substraction is:= " +(num1-num2));	
			break;
		case 3:
			System.out.println("Multiplication is:= " +(num1*num2));	
			break;
		case 4:
			System.out.println("Division is:= " +(num1/num2));	
			break;
			default:
			System.out.println("Invalid Opretions " );	
		
			
		}
		

	}

}
