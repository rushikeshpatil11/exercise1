package kanadesir;

import java.util.Scanner;

public class Prg14 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		
		int res=num%10;
		
		System.out.println("Result after module 10 :="+res);
		

	}

}
