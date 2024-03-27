package JavaRelated;

public class MethodOverloading {

	public void test() {
		System.out.println("testMethod");
	}
	
	public void test(int i) {
		System.out.println("Value of i:" +i);
	}
	
	public void test (int a, String b) {
		
	}
	public static void main(String[] args) {
		MethodOverloading m= new MethodOverloading();
		m.test(10);

	}

}
