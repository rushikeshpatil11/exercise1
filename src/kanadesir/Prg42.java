package kanadesir;

import java.util.Scanner;

public class Prg42 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rem, sum = 0;
		System.out.println("Enter any number");
		int num = sc.nextInt();
		while (num != 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
