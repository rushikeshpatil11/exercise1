package Exercise.com;

import java.util.Arrays;

public class CharCount {
	public static void count(String s) {
		String s1 = s.toLowerCase();
		char[] c = s1.toCharArray();
		System.out.println("Character Array of given String:" + Arrays.toString(c));
		int ch = 1;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '*')
				continue;
			else {
				for (int j = i + 1; j < c.length; j++) {
					if (c[j] == c[i]) {
						ch++;
						c[j] = '*';
					}

				}
				System.out.println(c[i] + ":" + ch);
				ch = 1;
			}
		}

	}

	public static int[] duplicateRemoved(int[] num) {

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		//int[] temp = new int[num.length];
		int count = 0;
		for (int i = 0; i < num.length - 1; i++) {
//			for (int j = i + 1; j < num.length -1; j++)
//			{
			if (num[i] == num[i + 1]) {
				continue;
			} else {
				num[count++] = num[i];
			}
//		     }
		}
		num[count++] = num[num.length - 1];
		int[] no = new int[count];
		for (int k = 0; k < count; k++) {
			no[k] = num[k];
		}
		return no;
	}

	public static void main(String[] args) {
		// count("Nishigandha");
		int[] num = { 1, 3, 2, 5, 3, 2, 5, 6, 1 };
		System.out.println(Arrays.toString(duplicateRemoved(num)));
	}
}
