package Exercise.com;

import java.util.HashMap;

public class StringCount {
	public static void main(String[] args) {
		String s = "NishiGandha";
		count(s);
	}

	public static void count(String s) {
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> h = new HashMap();

		for (char item : ch) {
			if (h.containsKey(item)) {
				int val = h.get(item);
				h.put(item, h.get(item) + 1);
			} else {
				h.put(item, (int) 1);
			}
		}
	}
}
