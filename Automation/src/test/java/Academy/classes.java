package Academy;

import java.util.ArrayList;

public class classes {

	public static void main(String[] args) {

		int[] a3 = {1,21,22,42,10,9,1};
		
		for(int i=0; i<a3.length; i++) {
			
			if (a3[i] % 2 == 0) {
//				System.out.println(a3[i] + "multiple by 2");
//				
//			}
//			else {
//				System.out.println(a3[i] + "not multiple by 2");
			
		}
		
		} 
		
		
		ArrayList<String> L1 = new ArrayList<String>();
		L1.add("Marvel");
		L1.add("Thor");
		L1.add("Hulk");
		L1.add("black");
		
		System.out.println(L1.get(2));
		
		
		for (int i=0; i<L1.size(); i++) {
			
			System.out.println(L1.get(i));
		}
		
/// call all funtion
		
		for(String z1 :L1) {
			System.out.println(z1);
		}
		
		
		
	}

}
