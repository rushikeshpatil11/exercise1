package kanadesir;

import java.util.Scanner;

public class Prg38 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value");
		int num=sc.nextInt();
		int res=1;
		for(int i=num;i>=1;i--)
		{
			res=res*i;
		}
			
		System.out.println(res);
	}

}
