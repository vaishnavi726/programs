package generics;

public class Container <i1, i2> {
	
	/*Object item;
	Object item1;
	public Container(Object item,Object item1) {  // object class is the super class to every data type it will take  any data type as object
		super();
		this.item = item;
		this.item1 = item1;
	}
	
	public void printItem() {
		System.out.println("printing the containers of container:");
		System.out.println("Item :" +item);
		System.out.println("Item1 :" +item1);
	}
	
	public Object getItem() {   this is by object. Since object is the class for every data type so that we can assign any data type.
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	public Object getItem1() {
		return item1;
	}
	public void setItem1(Object item1) {
		this.item1 = item1;
	}*/

 // usage of generics
	i1 item1;
	i2 item2;
	
	public Container(i1 item1, i2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public i1 getItem1() {
		return item1;
	}
	public void setItem1(i1 item1) {
		this.item1 = item1;
	}
	public i2 getItem2() {
		return item2;
	}
	public void setItem2(i2 item2) {
		this.item2 = item2;
	}



	/*public void printItem() {
		System.out.println("printing the containers of container:");
		System.out.println("Item1 :" +item1);
		System.out.println("Item2 :" +item2);
	}*/
}
