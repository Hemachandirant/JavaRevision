package Hema;

public class StringBuff {
	
	public static void main(String[] args) {
		StringBuffer k = new StringBuffer("Legend");
		k.append(" Hemachandirna");
		k.delete(1, 2);
		
		System.out.println(k);
	}

}
