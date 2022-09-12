package kanadesir;

import java.util.Scanner;

public class Prg7 {

	public static void main(String[] args) {
		double base,height,area;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Base and Height of triangle");
		base=sc.nextDouble();
		height=sc.nextDouble();
		area=0.5*base*height;
		
		System.out.println("Area of Triangle is:= "+area);
		
	}

}
