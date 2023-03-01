package Hema;

public class Demo {
	
	public static void main(String [] args) {
		
		Demo dem = new Demo();
		System.out.println(dem.getClass());
		Calculator cal = new Calculator();
		int ans = cal.add(1, 2);
		System.out.println(ans);
	}

}


class Calculator{
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
}
