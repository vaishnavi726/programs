package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class BankDetails implements Serializable{
	
	String accountNumber;
	int debitNumber;
	
	
	public BankDetails(String accountNumber, int debitNumber) {
		super();
		this.accountNumber = accountNumber;
		this.debitNumber = debitNumber;
	}
	
}

public class Bank {
	public static void main(String[] args) {
		
		BankDetails bd = new BankDetails("5913a3e5", 563);
		
		try {
			FileOutputStream  fout = new FileOutputStream("C:\\serialjava.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			
			fout.close();
			oos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin = new FileInputStream("C:\\serialjava.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			BankDetails b = (BankDetails) ois.readObject();
			
			fin.close();
			ois.close();
			
			System.out.println(b.accountNumber + " "+  b.debitNumber);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
