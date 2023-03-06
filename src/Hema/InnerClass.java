package Hema;


public class InnerClass{
	
	public static void main(String[] args) {
		InnerClassDemo obj = new InnerClassDemo();
		obj.show();
		
		InnerClassDemo.B obj1 = obj.new B();
		obj1.config();
	}
	
}

class InnerClassDemo {
	
	public void show() {
		
		System.out.println("In class Top");
	}
	
	class B{
		
		public void config() {
			System.out.println("In class B");
		}
	}

}
