package JavaRelated;

public class Encapsulation {
	
	//Employee Type
	private String name;
	private int age;
	private boolean isper;
	
	public Encapsulation(String name, int age, boolean isperm) {
		this.name = name;
		this.age = age;
		this.isper= isper;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isIsper() {
		return isper;
	}
	public void setIsper(boolean isper) {
		this.isper = isper;
	}
	
	
	

}
