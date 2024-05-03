package com.demo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Test {
	public static void main(String[] args){
		
		File file = new File("myfile");
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;    
		try {                      
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		    
			String line = bufferedReader.readLine();
			
		    while(line != null) {
				    System.out.println(line);
					line = bufferedReader.readLine();
				}
			
		}catch (FileNotFoundException e) {
			System.out.println("file doesn't exsists");
		}
		 catch (IOException e) {
				//e.printStackTrace();
			 System.out.println("problem is reading the file" +file.getName());
			}
		finally {
				try {
					if(bufferedReader != null) {
					  bufferedReader.close();
					}
					if(fileReader != null) {
					  fileReader.close();
					}
			} catch (IOException e) {
				System.out.println("unable to close the file" +file.getName());
			}catch(NullPointerException ex) {
				System.out.println("file never opened:" +ex);
			}
			}
		}
	}

		
		
	 
	
	
	


