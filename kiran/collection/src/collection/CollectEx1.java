package collection;

import java.text.DateFormat.Field;
import java.util.ArrayList;

public class CollectEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>(10);
		
		System.out.println("ArrayListsize:" +a.size());
		System.out.println("ArrayListCapacity:" +getArrayListCapacity(a));
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		
		System.out.println("ArrayList contains"+ a);
	   System.out.println("ArrayList size :"+ a.size());
       System.out.println("ArrayList capacity : " + getArrayListCapacity(a));
      
       a.add(11);
       
       System.out.println("ArrayList contains"+ a);
	   System.out.println("ArrayList size :"+ a.size());
       System.out.println("ArrayList capacity : " + getArrayListCapacity(a));
	}

	private static int getArrayListCapacity(ArrayList<Integer> a) {
		// TODO Auto-generated method stub
		
		//get the elementData field from ArrayList class
		Field arrayField = ArrayList.class.getDeclaredField("elementData");
		arrayField.setAccessible(true);
		
		//now get the elementData Object array from our list
		Object[] internalArray = (Object[])arrayField.get(list);
		//Internal array length is the ArrayList capacity!
		return internalArray.length;
	}

	
}
