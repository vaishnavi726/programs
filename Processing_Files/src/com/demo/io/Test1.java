package com.demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		
		File file = new File("myfile");
		
		try (FileReader fileReader = new FileReader(file);  //try with resources
			 BufferedReader bufferedReader = new BufferedReader(fileReader);){
		 
				String data = bufferedReader.readLine();
				while(data != null) {
					System.out.println(data);
					data = bufferedReader.readLine();
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File never excuted: "+file.getName());
			
		}
	}
}
