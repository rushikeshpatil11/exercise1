package kanadesir;
import java.util.Scanner;
public class Prg8 {
	public static void main(String[] args) {	
		double billamt,gstamt,netamt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Bill Amount");
		billamt=sc.nextInt();
		gstamt=billamt*18/100;
		netamt=billamt+gstamt;
		System.out.println("With GST18% Amount of Your Bill is := "+gstamt);
		System.out.println("Net Amount of Your Bill is := "+netamt);
	}
}
