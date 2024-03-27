package JavaPrograms;

public class ReverseStringg {

	public static void main(String[] args) {
		String str= "MynameisMonika";
		int len= str.length();
		String rvr="";
		for (int i=len-1;i>=0;i--) {
			rvr=rvr+str.charAt(i);
		}
		System.out.println(rvr);
		
	
		}
	}


