package JavaRelated;

import java.util.Scanner;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the line");
		String str=s.nextLine();
		int count=str.length()-str.replace("a", "").length();
		System.out.println(count);

	}

}
