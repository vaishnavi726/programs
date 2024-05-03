package demo.sw;

public class Constructor {
	
	int a;
	
	Constructor(){
		a=10;
		
		System.out.println("value of a:" +a);
	}
	
	//constructor with parameters
	
	int b;
	String name;
	
	Constructor(int x, String n){
		this.b = x;
		this.name = n;
		
		System.out.println("int value:" +b +" " +"name is:" +name );
	}
	
	//without constructor
	
	int c;
	String content;
	
	
	
	


	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(1,"A");
		Constructor c2 = new Constructor(2,"B");
		Constructor c3 = new Constructor(3,"C");
	    Constructor c4 = new Constructor();
	    Constructor c5 = new Constructor();
		 c4.c =26;
		 c4.content = "student 4";
		 c5.c=100;
		 c5.content ="student 5";
		 System.out.println("number is:" +c4.c +" "+ "name is:" +c4.content);
		 
		 System.out.println("number is:" +c5.c +" "+ "name is:" +c5.content);
		
	}

}
