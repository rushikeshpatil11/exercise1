package Exercise.com;

public class IsDigit {
	public static void main(String[] args) {
		String s1 = "s4875bd65bfhcf65bdf766bh";
		method(s1);
		
		String s4="Bhaskar";
		String s9="BhaskarSoftware";
		String s5=s4.concat("Software");
		String s6=s5.intern();
		String s7="BhaskarSoftware";
		System.out.println(s5==s6);
		System.out.println(s7==s6);

	}

	public static void method(String s) {
		 char[] ch=s.toCharArray();
//		StringBuffer sb = new StringBuffer();
//		StringBuffer sb1 = new StringBuffer();
		String s1="";
		String s2="";
		for (int i = 0; i < ch.length; i++) {
			//char c = s.charAt(i);
			if (Character.isDigit(ch[i])) {
				//int j = Integer.parseInt(s.valueOf(ch[i]));
//				sb.append(j);
		s1=s1.concat(s.valueOf(ch[i]));
			} 		else
			 {
				//sb1.append(ch[i]);
				s2=s2.concat(s.valueOf(ch[i]));
				
			}
			
		}
		System.out.println("sb=" + s1);
	System.out.println("sb1=" + s2);
	}
	}

