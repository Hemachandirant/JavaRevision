package Hema;

class Detials {
	
	private String name;
	private int id;
	private String sub;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public String getSub() {
		return sub;
	}
	
	

}


class GetterSetters{
	
	public static void main(String[] args) {
		
		Detials obj = new Detials();
		
		obj.setName("hemachandiran");
		
		
		System.out.println(obj.getName());
	}
}
