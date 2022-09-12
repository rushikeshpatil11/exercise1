package kanadesir;

import java.util.Scanner;

public class Prg44a {

	public static void main(String[] args) {
		
		int rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			System.out.print(rem);
			
			num=num/10;
		}
        

	}

}
