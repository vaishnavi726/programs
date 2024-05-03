package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
	
	String name;
	int num;
	
	
	public Emp(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
}

public class Employee{
	
	public static void main(String[] args) {
		
		Emp e = new Emp("A", 23);
	
			try {
				FileOutputStream fout = new FileOutputStream("C:\\serialjava.txt");
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
				
				out.writeObject(e);
				System.out.println("file created and Object saved!!!");
				out.close();
				fout.close();

			} 
			
			catch (IOException fe) { // to remove the error of object output stream chnaged 
				// the catch exception in parathesis
				// TODO Auto-generated catch block
				fe.printStackTrace();
			} 
		
	}
	
}