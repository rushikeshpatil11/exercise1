package kanadesir;

import java.util.Scanner;

public class Prg11 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A=");
		 a=sc.nextInt();
		System.out.println("Enter B=");
		 b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		
		System.out.println("A is ="+a);
		System.out.println("B is ="+b);

	}

}
