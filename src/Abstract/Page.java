package Abstract;

public abstract class Page {
	
	public Page() {
		System.out.println("page ..default...const....");
	}
	
	public Page(int i) {
		System.out.println("page ..const..." + i);
	}
	
	public abstract void title();

	public abstract void url();

	public void timeOut() {
		System.out.println("page -- time out : 20 secs");
	}

	public final void displayLogo() {
		System.out.println("page -- displayLogo");
	}


}
