package Hema;

public class AnonoymsClass {

	public static void main(String [] args) {
		new A("Hemachandiran");
		
	}
	
}

class A{
	
	String name ;
	
	A(){
		System.out.println("in non-parameterized constructor");
	}
	A(String name){
		this.name = name;
		System.out.println("in parameterized consturctor");
	}
	
	public String printName() {
		return name;
	}
}
