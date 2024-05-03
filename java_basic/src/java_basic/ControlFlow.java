package java_basic;

public class ControlFlow {

	//public static void main(String[] args) {
		//boolean bool= true;
		/*if(bool== false) {
			System.out.println("correct value");
		}
		else {
			System.out.println("Incorrect value");
		}
		
		int speed =5;
		if(!(speed!=5)) {
			System.out.println("minimum speed of vehicle");
		}
		else {
			System.out.println("maximum speed of vehicle");
		}
		
		String colorcode="A098";
		String actualcolorcode="A099";
		int value;
		if(colorcode== actualcolorcode) {
			value =10;
		}else if(colorcode != actualcolorcode){
			value=20;
		}else if(colorcode == actualcolorcode){
			value=30;
		}else {
			value=50;
		}
		System.out.println(value);
	
	
	/* int Temperature=70;
	 int actualtemp=30;
	
	String s ; 
	
	if (Temperature != actualtemp) {
	if (Temperature<= actualtemp) {
		s="It's very cool";
	}
	else if(Temperature<actualtemp) {
		s ="It is warmer";
	}else if(Temperature>=actualtemp) {
		s ="It is hot";
	}else {
		s="It's a beautiful day";
	}
    }else {
	s="goodday";
   }
	System.out.println(s);*/


    public static void main(String[] args) {
		
	int month=6;
	String  month1;
     switch(month) {
     
     case 1: month1 ="January";
         System.out.println(month1);
          break;
     case 2: month1 ="Febuary";
         System.out.println(month1);
         break;
     case 3: month1 ="March";
         System.out.println(month1);
         break;
     case 4: month1 ="April";
          System.out.println(month1);
         break;
     case 5: month1 ="May";
          System.out.println(month1);
      break;
     
    default:month1 = "invald month";
           System.out.println("Invalid");
         break;
 }
}
   
}