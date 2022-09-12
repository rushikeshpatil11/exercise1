package kanadesir;

import java.util.Scanner;

public class Prg24 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter model number");
		System.out.println("Model 123");
		System.out.println("Model 456");
		System.out.println("Model 789");
		int model=sc.nextInt();
		
		switch(model)
		{
		case 123:
			System.out.println("Model 123 is for Rs- 1,00,000/- Only");
			break;
		case 456:
			System.out.println("Model 456 is for Rs- 1,50,000/- Only");
			break;
		case 789:
			System.out.println("Model 789 is for Rs- 2,00,000/- Only");
			break;
		default:
			System.out.println("Model Not Available");
			
		}

	}

}
