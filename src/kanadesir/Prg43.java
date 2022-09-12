package kanadesir;

import java.util.Scanner;

public class Prg43 {

	public static void main(String[] args) {
		int rem,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		while(num!=0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);

	}

}
