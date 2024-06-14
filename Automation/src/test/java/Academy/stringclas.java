package Academy;

public class stringclas {
	
	public static void main(String[] args) {
		
		String s1 = "meow cat eat food ";
		String[] split1 = s1.split(" ");
		System.out.println(split1[0]);
		System.out.println(split1[1]);
		System.out.println(split1[2]);
		System.out.println(split1[3].trim());
		
		for(int i=0; i<s1.length(); i++) {
			
			
			System.out.println(s1.charAt(i));
		}
		
		/////////////////////////////////////////////////////////////////////////reverse method//////////////////////////
		for(int i=s1.length()-1; i>0; i--) {
			
			
			System.out.println(s1.charAt(i));
		}

		
	}
	
	

}
