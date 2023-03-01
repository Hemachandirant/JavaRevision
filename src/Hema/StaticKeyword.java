package Hema;

public class StaticKeyword {
	
	public static void main(String[] args) {
		
		Product p = new Product();
		p.id=1;
		p.name="Apple";
	
		
		System.out.println(p.viewAll());
		
	}

	
}

class Product{
	String name;
	int id;
	static long price;
	static {
		 price = 2000;
	}
	public String viewAll() {
	
		return name+" :" +id+" :"+price;
		
	}
}
