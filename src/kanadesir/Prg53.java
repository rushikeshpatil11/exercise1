package kanadesir;

import java.util.Scanner;

public class Prg53 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int count=0;
		if(num==0 || num==1)
		{
			System.out.println("Given number is Not prime number");
		}
		else
		{
			for(int i=2;i<=num;i++)
			{
				if(num%2==0)
				{
					count++;
				}
			}
				if(count==0)
					System.out.println("Given number is  prime number");
				else
					System.out.println("Given number  Not is  prime number");
					
			}
		}

	}


