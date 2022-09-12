package kanadesir;

import java.util.Scanner;

public class Prg13 {

	public static void main(String[] args) {
		
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of X & Y");
		x=sc.nextInt();
		y=sc.nextInt();
		z = extracted(x, y);
		
		System.out.println("Value of Exp. is :="+z);

	}

	private static int extracted(int x, int y) {
		int z;
		z=(4*x*x+5*y*y*y)/2*x*y;
		return z;
	}

}
