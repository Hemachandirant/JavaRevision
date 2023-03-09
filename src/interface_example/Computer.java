package interface_example;

public interface Computer {
	
	String name = "Asus";
	String Processor = "Intel i7";
	long price = 560000;
	
	
	public void run();
	
	default int processingSpeed() {
		return 12_000;
	}
}
