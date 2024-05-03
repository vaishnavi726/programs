package inheritance;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile1 mobile = new Mobile1("samsung", 6,800);
		mobile.playGame();
		mobile.makeaCall();
		
		SmartPhone smart = new SmartPhone("apple",120, 1.2);
        smart.extraFeatures();
        smart.playGame();
        
        Iphone iphone = new Iphone("apple iphone X", 80,2.4);
        iphone.ultimatepixcel();
	}

}

