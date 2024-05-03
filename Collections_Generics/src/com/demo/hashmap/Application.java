package com.demo.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class Application {
	public static void main(String[] args) {
		
		//HashMap<String , String>words = new HashMap<String, String>();
		//LinkedHashMap<String , String>words = new LinkedHashMap<String, String>();// inorder to sortof isertion.
		TreeMap<String, Integer > words = new TreeMap<String, Integer>();
		words.put("welocme", 23);
		words.put("expert", 45);
		words.put("motto",56);
		words.put("keep", 45);
		words.put("enjoy",92);
		words.put("enjoy", 90);
		for(String display: words.keySet()) {
			//System.out.println(display);
			System.out.println(words.get(display));// to get the values of key
		}
		/*for(String display: words.values()) {
			//System.out.println(display);
			System.out.println(words.get(display));// to get the entire value of key
		}*/
		
		for( Map.Entry<String,Integer> a :words.entrySet()) //entrySet is used to display bot key and value
		{
		System.out.println(a.getKey());
		System.out.println(a.getValue());
		}
	}

}
