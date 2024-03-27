package JavaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int i=1215;
		temp=i;
		while(i>0) {
			r=i%10;
			sum=(sum*10)+r;
			i=i/10;
		}
		if(temp==sum) 
			System.out.println("pelindrom is true");
		 else 
			System.out.println("pelindrom is false");

	}

}
