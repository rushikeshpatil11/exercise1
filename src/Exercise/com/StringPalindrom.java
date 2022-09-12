package Exercise.com;

import java.util.Arrays;

public class StringPalindrom {
public static void main(String[] args) {
	String s="nitin";
	palindrom(s);
	
}

public static void palindrom(String s)
{int i,j=0;
char[] ch=s.toCharArray();
//System.out.println(ch);
char[] ch1=new char[ch.length];
for( i=ch.length-1;i>=0;i--)
{
	ch1[j]=ch[i];
	j++;
}
String sr=new String(ch1);
if(s.equalsIgnoreCase(sr))
	System.out.println("String is palindrom");
else
	System.out.println("String is not palindrom");
}
}
