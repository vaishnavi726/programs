package demo.sw;

public class StrBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello string buffer");
		StringBuffer s = new StringBuffer("Hai");
		
		System.out.println(sb);
		System.out.println(sb.length());
	//	System.out.println(sb.append(23)); we can add any datatype
		System.out.println(sb.append("welcome"));
		System.out.println(sb.delete(1,3)); // here the output - hlo string bufferwelcome
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.substring(2));//print the elements from 2
		System.out.println(sb.substring(1,4));  // o s ?
		System.out.println(s.insert(3, "welcome"));
		System.out.println(s.replace(0, 3, "hello"));
		System.out.println(s.reverse());
		System.out.println(s.append("java"));
		
	//	System.out.println(s.concat("program")); concat method is not applicable for string buffer
		//It is applicable for stirng
	}

}
