package kanadesir;

import java.util.Scanner;

public class Prg40 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		int res=1;
		for(int i=1;i<=num;i++)
		{
			res=res*i;
		}
		System.out.println("Factorial of Given Number is:="+res);


	}

}
