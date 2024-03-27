package Abstract;

public class PageTest {

	public static void main(String[] args) {
		LoginPage lp= new LoginPage(10);
		lp.displayLogo();
		lp.timeOut();
		lp.title();
		lp.url();
		//top casting:
		//child class object can be referred by abstract parent class ref variable:
			
			Page p = new LoginPage();
			p.displayLogo();
			p.timeOut();
			p.title();
			p.url();
			
	}

}
