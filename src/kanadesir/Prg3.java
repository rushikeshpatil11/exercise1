package kanadesir;

import java.util.Scanner;

public class Prg3 {

	public static void main(String[] args) {
		int m1,m2,m3,m4,m5;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 subject");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		avg=(m1+m2+m3+m4+m5)/5;
		
		System.out.println("Avg. marks of 5 subject is:=" +avg);
	}

}
