package JavaPrograms;

import java.util.Scanner;

public class NumberofDigit {

	public static void main(String[] args) {
		int no,a=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number:");
		no=s.nextInt();
		if(no<0) {
			no=no*(-1);
			
		}
		if(no==0) {
			System.out.println("No. of digits: 1 ");
		}
		while(no>0) {
		no=no/10;
		a++;}
		System.out.println("No. of digits: " +a);

		}
	}


