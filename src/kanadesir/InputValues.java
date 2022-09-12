package kanadesir;

import java.util.Scanner;

public class InputValues {

	public static void main(String[] args) {

		int []a=new int[10];
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter any number");
			int num=sc.nextInt();
			if(num<0)
				continue;
			a[i]=num;
			count++;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
			
	}

}
