package kanadesir;

import java.util.Scanner;

public class Prg45 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int max=num%10;
		int min=num%10;
		int rem;
		while(num!=0) {
			rem=num%10;
			if(rem>max) 
			max=rem;	
			else if(rem<min)
				min=rem;
			num=num/10;
		}
		System.out.println("Max Digit is:=" +max);
		System.out.println("Min Digit is:=" +min);

	}

}
