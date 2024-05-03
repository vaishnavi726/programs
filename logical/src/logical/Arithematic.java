package logical;
/*classname arithematic operation.Develop 4 method two static methods 2 non staticmethods,1st static method with two integer arguments,perform mutiplication operation and return the result 
and 2nd static method with two  double arg, peform division operation and return result,first non static method with int and double args,perform sub operation ,call all the methods from main method,pass all
the result as input to second non static method perform addition using all the results and dont return the result rather print thr result in the same method*/

public class Arit {
	public static int mul(int i, int j) {
		return i*j;
	}
	public static double div(double i, double j) {
		return i/j;
	}
	public double sub(int i, double j) {
		return i - j;
		
	}

}
public  class Arithematic{
	public static void main(String[] args) {
		Arit arithematic = new Arit();
		arithematic.mul(1,2);
		arithematic.div(1.5,2.09);
		arithematic.sub(1,2.5);
		
		
		
	}
}
