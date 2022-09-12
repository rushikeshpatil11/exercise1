package kanadesir;
import java.util.Scanner;
public class Prg49
{
	public static void main(String args[])
	{
		int rem;
		int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 digit number");
		int num=sc.nextInt();
		int num1=num;
		while(num!=0) {
			rem=num%10;
			res=res+rem*rem*rem;
			num=num/10;
		}
		if(num1==res)
			System.out.println("Given number is armstrong number");
		else
			System.out.println("Given number is not armstrong number");
	}
}