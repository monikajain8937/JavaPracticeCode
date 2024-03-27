package JavaRelated;

public class Encap1 {
	
	
	public static void main(String[] args) {
		//Encap1 en1= new Encap1();
		//en1.setName("Tom");
		//System.out.println(en1.getName());
		
		Encapsulation e1 = new Encapsulation("tom",20,true);// POST - create

		// GET - retrieve
		System.out.println(e1.getName());
		
		
	}

}