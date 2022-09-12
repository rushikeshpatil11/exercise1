package kanadesir;

import java.util.Scanner;

public class Prg54 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				
			}
		}
		System.out.println(sum);
		if(num==sum)
			System.out.println("Given number is Exact number");
		else
			System.out.println("Given number is Not Exact number");
	}

}
