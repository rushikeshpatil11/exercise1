package kanadesir;

import java.util.Scanner;

public class Prg16 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2) 
		{		System.out.println(num1+ " is Greater number");
		System.out.println(num2+ " is Smaller number");
	}
		else
		{		System.out.println(num2+ "  is Greater number");
		System.out.println(num1+ " is Smaller number");
	}
			
			
		
	}

}
