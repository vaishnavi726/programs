package lamda_project;

public class Application {

	public static void main(String[] args) {
		Human human = new Human();
		walker(human);
		
		Robot robot = new Robot();
		walker(robot);
		
		/*walker(new Walkable(){

			@Override
			public void walk() {
				System.out.println("custom object is walking....");
				
			}
			
		});

	}*/
// Anonymous class
     /*  walker( () -> { System.out.println("custom object is walking....");
       });
	}*/
		
		walker( () ->  System.out.println("custom object is walking...."));
		
		/*ALamdaInterface blockOfCode =  () -> {
		System.out.println("custom object is running");
		};
	}*/
		
		Walkable  blockOfCode =  () -> {
			System.out.println("custom object is running");
			};
			
			walker(blockOfCode);
			
			
		ALamdaInterface	helloVar =  () -> System.out.println("Hello All");
		Caluclate  sum = (a,b) ->  a+b;
		helloVar.someMethod();
		System.out.println(sum.compute(100, 32));
		
		
		Divide div = (c,d) -> {
			if(c == 0) {
				return 0;
			}
			return  c/d;
		};
		
		System.out.println(div.divide(2,4));
		
		/* Reverse reverser = (s) -> {
			String result="";
			for(int i=s.length() -1; i>=0;i--) {
				result += s.charAt(i);
			}
			return result;
		};*/
		
		MyGenericInterface<String> reverser = (s) -> {
			String result="";
			for(int i=s.length() -1; i>=0;i--) {
				result += s.charAt(i);
			}
			return result;
		};
		
		System.out.println(reverser.work("vehicle"));
		
		/*Number res = (n) ->{
			int result=1;
	    	for(int i=1; i<=n; i++) {
	    	result = result*i;
	    
	    }
	    return result;
};
		System.out.println(res.num(5));*/
		
	    MyGenericInterface<Integer> res = (n) ->{
			int result=1;
	    	for(int i=1; i<=n; i++) {
	    	result = result*i;
	    
	    }
	    return result;
};
		System.out.println(res.work(10));
	 }
			
	/*public static void walker(Human human) {
		human.walk();
	}*/
	
	
	
	public void sayHello() {   // converting this method to the lamda function
		
		System.out.println("Hello All");
	}
	
	public int sum(int arg1 , int arg2) {
		return arg1+ arg2;
	}
	public static void walker(Walkable walkableEntity) { // to use the same methods change to interface walkable
		walkableEntity.walk();
	}
	
	public int div(int arg1, int arg2) {
		if(arg1 ==0) {
			return 0;
		}
		return  arg1/arg2;
	}
	
    public String reverse(String str) {
    	String result="";
    	for(int i = str.length() -1; i>=0;i--) {
    		result+= str.charAt(i);
    }
    return result;
}
    public int factorial(int num) {
    	int result=1;
    	for(int i=1; i<=num; i++) {
    	result = result*i;
    
    }
    return result;

}
}
interface Caluclate{
	int  compute(int a, int b);
}

interface Divide{
	int divide(int c, int d);
	}
/*interface Reverse{
	public String work(String str);
}*/

 interface MyGenericInterface<T>{
	 public T work(T t);
	 
 }
interface Number{
	public int num(int e);
}
