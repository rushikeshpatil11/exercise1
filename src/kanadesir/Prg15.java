package kanadesir;

import java.util.Scanner;

public class Prg15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		if(num>=0)
			System.out.println("It is Positive Number :="+num);
		else
			System.out.println("It is Negative Number :="+num);
		

	}

}
