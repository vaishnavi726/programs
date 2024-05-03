package loops;

public class StringLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String stri = "What a beautiful place it was" 
				+"the property:belongs to nature"
				+ "more in demand property:enjoy the beauty of nature: air...";
		
		extractString(stri);
	}
	
	public static void extractString(String str) {
		
		int i = 0;
		while(true) {
			int found = str.indexOf("property:" , i);
			if(found == -1) 
				break;
      int start = found + 9;
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end+1;
		}
		
	
	}
	}
	


