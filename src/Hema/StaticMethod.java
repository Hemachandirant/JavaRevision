package Hema;

public class StaticMethod {
	
	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		obj.model="Zenfone max pro";
		obj.price = 23000;
		
		Mobile.view(obj);
		
	}

}

class Mobile{
	
	String model;
	int price;
	
	public static void view(Mobile obj) {
		System.out.println("Model : "+obj.model+" Price: "+obj.price);
	}
}
