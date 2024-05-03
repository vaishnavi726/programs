package com.demo.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		/*File file = new File("myfile");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine())
		{
			String text =scan.nextLine();
			System.out.println(text);
			
		}
		scan.close();*/
		
		try {
			File file = new File("myfile");
			Scanner input = new Scanner(file);
			while(input.hasNextLine())
			{
			   String text = input.nextLine();
			   System.out.println(text);
			}
		    input.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println("file doesn't exsits");
			//e.printStackTrace();
		}
		
		MyUtils utils = new MyUtils();
		try {
			System.out.println(utils.subtract10fromnumber(20));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
