package Exercise.com;

import java.util.Arrays;

public class CountWord {
	public static void main(String[] args) {
		String s="India is my country and l love my country";
		method(s);
	}

	public static void method(String s)
	{int count=1,i,j;
		String word[]=s.split(" ");
		System.out.println(Arrays.toString(word));
		for( i=0;i<word.length;i++) {
			if(word[i]=="*")
				continue;
			else
		    {
				for( j=i+1;j<word.length;j++)
		             {
	                 	if(word[i].equals(word[j]))	
	                 	{
		               		count++;
	                      	word[j]="*";
		                }
		
		              }
			System.out.println(word[i] +count);
			count=1;
		    }
		
		//System.out.println("words="+count);
		
	      }
}}
