package kanadesir;

import java.util.Scanner;

public class Prg9 {

	public static void main(String[] args) {
		double loan,intamt,totalamt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Loan Amount");
		loan=sc.nextDouble();
		
		intamt=loan*12/100;
		
		totalamt=loan+intamt;
		System.out.println("Your Loan Interest(12%) Amount is :=" +intamt);
		System.out.println("Your Loan Total Amount is :=" +totalamt);
	}

}
