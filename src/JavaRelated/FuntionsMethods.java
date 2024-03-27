package JavaRelated;

import java.util.ArrayList;

public class FuntionsMethods {

	public void test() {
		System.out.println("TestMethod");
	}

	public String getName() {
		System.out.println("Get name");
		String n = "Tom";
		return n;
	}
	
	public int sum(int x, int y) {
		System.out.println("Sum Method");
		int z= x+y;
		return z;
	}
	public void getDeviceList(String empName) {
		System.out.println("Getting device list for:" +empName);
		ArrayList<String> ar= new ArrayList<String>();
		if (empName.equals("Aarti")) {
			ar.add("iphone13");
		}
			
	}

	public static void main(String[] args) {

		FuntionsMethods fm = new FuntionsMethods();
		fm.test();
		String Name = fm.getName();
		System.out.println(Name);
		int totalsum= fm.sum(10, 20);
		System.out.println(totalsum);
	}

}
