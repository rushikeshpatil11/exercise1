package kanadesir;

import java.util.Scanner;

public class Prg10 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Basic Sallary");
		double sal=sc.nextDouble();
		System.out.println("Your Net Sallary is:= "+net(sal));
		

	}
	public static double net(double basic)
	{
		double hra,ta,da,ma,pf,netSallary;
		hra=basic*0.45;
		ta=basic*0.25;
		da=basic*0.30;
		ma=basic*0.05;
		pf=basic*0.25;
		
		netSallary=basic+hra+ta+da-ma-pf;
		return netSallary;
		
	}

}
