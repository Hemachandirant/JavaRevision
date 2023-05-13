package Hema;

public class LambdaExpression {

	public static void main(String[] args) {
		
//		Demos d = new Demos() {
//			public void show() {
//				System.out.println("Hai");
//			}
//		};
		
		Demos d = () -> System.out.println("Hai, iam a demo using lambda expression");
		d.show();

	}

}


@FunctionalInterface
interface Demos{
	
	void show();
	
}
