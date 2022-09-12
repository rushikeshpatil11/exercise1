package kanadesir;

import java.util.Scanner;

public class Prg5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		double r=sc.nextDouble();
		System.out.println("Area of Circle is := "+(area(r)));
		System.out.println("Circumference of Circle is := "+(circumference(r)));
		

	}
	public static double area(double r)
	
	{
		double ac=3.14*r*r;
		return ac;
	}
	public static double circumference(double r)
	
	{
		double aci=2*3.14*r;
		return aci;
	}

}
