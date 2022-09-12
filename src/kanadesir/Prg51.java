package kanadesir;

import java.util.Scanner;

public class Prg51 {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int base=sc.nextInt();
        int power=sc.nextInt();
        int res=1;
        for(int i=1;i<=power;i++)
        {
        	res=res*base;
        }
        System.out.println(res);
	}

}
