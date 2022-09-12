package Exercise.com;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class PalindromNumber {
public static void main(String[] args) {
	int num=153;
	palindrom(num);
}
public static void palindrom(int num)
{int digit=0,rem;
double sum=0;
	while(num>0)
	{
		num=num/10;
		digit++;
	//	System.out.println(digit);

	}
		while(num>0)
	{
		rem=num%10;
		sum=sum+power(rem,digit);
		//System.out.println(sum);

		num=num/10;
		System.out.println(num);
	}
	if(sum==num)
		System.out.println("Number is palindrom");
	else
		System.out.println("number is not palilndrom");
}
public static int power(int rem,int digit)
{
	return rem=rem*digit;
}
}
