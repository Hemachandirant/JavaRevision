package Hema;

public class Car {

	public static void main(String[] args) {
		
		
		int i =0;
		int j = 12;
		
		try {
			int ans = j/i;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
			
		}
		finally {
			System.out.println("End of program exectuion");
		}
	}

}
