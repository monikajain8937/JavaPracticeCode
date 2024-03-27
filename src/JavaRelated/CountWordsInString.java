package JavaRelated;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		int count=1,i;
		for(i=0;i<str.length();i++) {
		if (str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
			count++;
		}}
		System.out.println(count);	
	}

	}


