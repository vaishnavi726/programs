package com.demo.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		
		File file = new File("myfile2");
		BufferedReader bufferedReader= null;
		try {
			FileReader fileReader = new FileReader(file);
	        bufferedReader = new BufferedReader(fileReader);
			String line1 = bufferedReader.readLine();
			
			
			while(line1 != null) {
				System.out.println(line1);
				line1 = bufferedReader.readLine();
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File was found");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("problem with reading the file" +file.getName());
		}finally {
			
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			System.out.println("unable to close the file:" +file.getName());
			}
			
		}
	

	}

}
