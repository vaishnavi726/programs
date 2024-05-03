package demo.sw;

public class StrBuff {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("welcome here");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("to learn the course");
		System.out.println(sb1.length());
		System.out.println(sb1.append(sb));
		
		
		String s = new String("hello");
		String s1 = s.concat("there");
		System.out.println(s1);
		
	}

}
