package JavaPrograms;

import java.util.Scanner;

public class EvenandOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		int r=num%2;
		if(r==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
