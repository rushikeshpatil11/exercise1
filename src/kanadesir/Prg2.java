package kanadesir;

import java.util.Scanner;



public class Prg2 {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three value");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d = mul(a, b, c);
System.out.println("Multification of three value is:= "+d);
	}

	private static int mul(int a, int b, int c) {
		int d;
		d=a*b*c;
		return d;
	}

}
