package kanadesir;

import java.util.Scanner;

public class Prg25 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select City ");
		System.out.println("Enter 1 for Kolhapur");
		System.out.println("Enter 2 for Pune");
		System.out.println("Enter 3 for Satara");
		System.out.println("Enter 4 for Mumbai");
		int city=sc.nextInt();
		
		switch(city)
		{
		case 1:
			System.out.println("You Must Try Kolhapuri Tambda-Pandhra");
			break;
		case 2:
			System.out.println("You Must Try Puneri Bhakarvadi");
			break;
		case 3:
			System.out.println("You Must Try Satari Pedhe");
			break;
		case 4:
			System.out.println("You Must Try Mumbaicha Vada-Pav");
			break;
		default:
			System.out.println("City Not Available");
			
		}

	}

}
