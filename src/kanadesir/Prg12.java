package kanadesir;

import java.util.Scanner;

public class Prg12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A is =");
		int a=sc.nextInt();
		System.out.println("Enter B is =");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A is= "+a);
		System.out.println("B is= "+b);
		

	}

}
