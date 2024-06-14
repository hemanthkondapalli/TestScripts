package Academy;

public class method {

	public static void main(String[] args) {
		
		
		
		String s9 = "apple cat jet";
		String[] div = s9.split(" ");
		System.out.println(div[0]);
		
		
		for(int i=0; i<s9.length(); i++) {
			
			System.out.println(s9);
			
			//////////string ////split/////
			System.out.println(s9.charAt(i));

		}
		
		for (int i=s9.length()-1; i>0; i--) {
			
			System.out.println(s9.charAt(i));
		}
		
	}
	

}
