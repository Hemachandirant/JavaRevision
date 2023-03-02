package Hema;

public class DynamicMethodDispatch {
	
	public static void main(String[] args) {
		
		AB obj = new AB();
		System.out.println(obj.show());
		
		obj = new B();
		System.out.println(obj.show());
		
	}

}

class AB{
	
	public String show() {
		return "In class A";
	}
}

class B extends AB{
	
	public String show() {
		return "In class B";
	}
}
