package wrapperclass;

public class Wclass {

	public static void main(String[] args) {

		Integer myInt = 9;
		Float f = 7.8f;
		Double d = 67.8;

		System.out.println(myInt);
		System.out.println(f);
		System.out.println(d);

		System.out.println(myInt.intValue());
		// System.out.println(str.strValue()); string/str value is not appropriate
		// method
		System.out.println(d.doubleValue());
		System.out.println(f.floatValue());

	}

}
