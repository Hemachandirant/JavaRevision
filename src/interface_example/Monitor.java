package interface_example;

public interface Monitor {
	 double size = 12.7;
	 String panel = "LCD";
	 
	 
	 public void isRunning();
	 
	 default void bootspeed() {
		 System.out.println("Monitor is booted");
	 }

	void run();
}
