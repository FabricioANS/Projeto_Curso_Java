package application;

public class Program001 {
	
	public static void main (String[] args) {
		
		String[] vect = new String[] {"maria", "bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
				
		}
		
		System.out.println("____________");
		
		for (String obj : vect) {
			System.out.println(obj);
		}
			
	}
}




