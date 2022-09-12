package kanadesir;

import java.util.Scanner;

public class Prg19 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 4 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		if(num1<num2 && num1<num3 && num1<num4)
			System.out.println(num1+" is Smaller number");
		else if(num2<num1 && num2<num3 && num2<num4)
			System.out.println(num2+" is Smaller number");
		else if(num3<num1 && num3<num2 && num3<num4) 
			System.out.println(num3+" is Smaller number");
		else
			System.out.println(num4+" is Smaller number");
	}

}
