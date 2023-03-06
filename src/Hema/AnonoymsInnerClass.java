package Hema;

public class AnonoymsInnerClass {
	
	public static void main(String[] args) {
		
		An obj = new An() {
			
			public void isWorking() {
				System.out.println("System is working with minimum CPU utlization");
			}
			
		
		};
		
		obj.isWorking();
	}

}


class An{
	
	public void isWorking() {
		System.out.println("System is working under maxing cpu utilization");
	}
}
