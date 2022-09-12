package kanadesir;

import java.util.Scanner;

public class Prg6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Two sides of rectangle");
		double s1=sc.nextDouble();
		double s2=sc.nextDouble();
		double area=s1*s2;
		
		System.out.println("Area of Rectangle is :="+area);
	}

}
