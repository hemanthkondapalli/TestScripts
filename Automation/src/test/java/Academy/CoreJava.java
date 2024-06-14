package Academy;

public class CoreJava {

	public static void main(String[] args) {

		int num = 10;
		String x = "cat";
		char y ='C';
		double z = 2.02;
		boolean a = true;
	
//		System.out.println(x);
		
		//Array///
		
		
		int[] a1 = new int[4];
		a1[0] = 10;
		a1[1] = 40;
		a1[2] = 30;
		a1[3] = 20;
	
	
		
		
		int[] a2 = {2,10,9,1};
				
//		System.out.println(a2[1]);
				
		for(int i=0; i<a2.length; i++) {
			
		System.out.println(a2[i]);
		
	}
	
		
		String[]  n1 = {"chrome", "firefox", "safari"};		
		for(int i=0; i<n1.length; i++) {
		System.out.println(n1[i]);
			
			
		}
	}
}
