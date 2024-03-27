package Abstract;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("LP - default const....");
	}
	
	public LoginPage(int i) {
		super(i);
		System.out.println("LP - const...."+i);
	}

	@Override
	public void title() {
		System.out.println("Login Page Title");
		
	}

	@Override
	public void url() {
		System.out.println(" Login Page URL");
		
	}

}
