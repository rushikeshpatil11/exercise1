package Exercise.com;

public class ReverseEachWordInString {
public static void main(String[] args) {
	String s="This is the java prograam";
	
	reverse(s);
	String s1="My name is khan";
	//reverse1(s1);
}


public static void reverse(String s)
{int i,j;
String word[]=s.split(" ");	
String bb ="";
for( String sr:word)
{
	StringBuilder sb=new StringBuilder(sr);
    sb.reverse();
   bb=bb+sb.toString()+" ";
    
}
System.out.println(bb);
}



public static void reverse1(String s)
{
	String str1 ="" ;
	String s1=" ";
	for(int i=s.length()-1;i>=0;i--)
	{
		
		char ch=s.charAt(i);
		s1=s1+ch;
	}
		String[] str=s1.split(" ");
for(int j=str.length-1;j>0;j--)
{
	str1=str1+str[j]+" ";
}
		//str1=str1.trim();
		
//		StringBuilder sb=new StringBuilder(s);
// s2=sb.reverse().toString();
		System.out.println(str1);
	}

}


