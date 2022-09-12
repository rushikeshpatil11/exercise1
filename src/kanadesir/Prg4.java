package kanadesir;

import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		int length,breadth,height,volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length,Breadth and Height of Box");
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		volume=length*breadth*height;
		
		System.out.println("Volume of Box is:= " +volume);
	}

}
