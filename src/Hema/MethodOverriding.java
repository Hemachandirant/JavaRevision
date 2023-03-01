package Hema;

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		System.out.println(obj.add());
	}

}

class ParentClass{
	public String add() {
		 return "This is add";
	}
	
	public String sub() {
		return "This is sub";
	}
}


class SubClass extends ParentClass{
	
	@Override
	public String add() {
		return "This is add in sub-class";
	}
}
