package Exercise.com;

import java.util.*;

public class SecondHighestNumberFromList {
	
	
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(21);
		al.add(22);
		al.add(20);
		al.add(50);
		al.add(1);
		al.add(2);
		al.add(10);
		 System.out.println(highstNumber(al));
		 System.out.println(al);
		 al.remove(8);
		 System.out.println(al);

//
//		bigNum(545632857);
				
			

	}

	public static Object highstNumber(List al) {
		int n = al.size();
		Collections.sort(al);

		return al.get(n - 2);
	}

	public static void bigNum(int num) {
		int rem, max = 0;
		while (num > 0) {
			rem = num % 10;
			if (max < rem) {
				max = rem;

			}
			num = num / 10;

		}
		System.out.println(max);

	}
}
