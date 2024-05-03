package demo.sw;

public class Instblock {
	
	int i;
	
	{
		i=90;
		System.out.println(i);
	}
	static
	{
	System.out.println("static block executed....");
	}
	
	public static void main(String[] args) {
		  
		Instblock i = new Instblock();
		Instblock i1 = new Instblock();

		Instblock i2 = new Instblock();

	}

}
