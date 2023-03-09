package interface_example;

public class Laptop implements Computer, Monitor {
	
	public static void main(String[] args) {
		
		Laptop lap = new Laptop();
		lap.run();
		lap.isRunning();
		lap.processingSpeed();
		lap.bootspeed();
		
	}

	@Override
	public void run() {
		System.out.println("Laptop is running fine");
		
	}

	@Override
	public void isRunning() {
		System.out.println("Monitor is running fine");
		
	}

}
