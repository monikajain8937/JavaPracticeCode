package JavaRelated;

public class Contructor {
int age;
String name;

	public Contructor() {
		
	}
	public Contructor(int age) {
		
	}
	public Contructor (String name, int age) {
		this.name= name;
		this.age=age;
	}
	public static void main(String[] args) {
		Contructor c1= new Contructor("Tom", 24);
		System.out.println(c1.name+ " "+ c1.age);
		

	}

}
