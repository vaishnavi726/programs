package demo.sw;

public class Arr {
	
	public static void main(String[] args) {
		
		int a[] = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=34;
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		String s[] = new String[4];
		s[0] ="welcome";
		s[1] = "to";
		s[2] ="java";
		s[3] ="programming";
		
		for(String x: s)
		{
			System.out.println(x);
		}
		
		int b[] = {11,12,13,14,15};
		for(int x: b) {
			System.out.println(x);
		}
	}

}
