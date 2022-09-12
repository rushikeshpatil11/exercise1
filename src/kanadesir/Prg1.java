package kanadesir;

import java.util.Scanner;

public class Prg1 {

	public static void main(String args[]) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two integer values");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("Addition of two numbers is := " + c);
	}

}
