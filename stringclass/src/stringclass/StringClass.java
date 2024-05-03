package stringclass;

public class StringClass {
	public static void main(String[] args) {
		//String a="welcome";
		//String b ="to the party";
		String c = "hello yogi there yogi there";
		
		/*if(a.equals("welcome")) {
			System.out.println("enjoy the grand event");
		}
		if(!a.equals("welcome")) {
			System.out.println("enjoy the grand event");
		}
		
		if(b.equalsIgnoreCase("To THe PaRty")) {
			System.out.println("It's joyful moment");
		}
		
		System.out.println(c.indexOf("the"));
		System.out.println(b.lastIndexOf("the"));
		System.out.println(c.lastIndexOf("the",6));*/
		
		System.out.println(c.indexOf("yogi"));
		System.out.println(c.lastIndexOf("yogi"));
		System.out.println(c.charAt(7));
		System.out.println(c.substring(2,7));
	}

}
