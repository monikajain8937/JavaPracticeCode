package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int reminder,reverse=0;
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter any No. ");
		int no=sr.nextInt();
		while(no>0) {
			reminder=no%10;//84, remi=4
			reverse =reverse*10+reminder;//0+4=4
			no=no/10;//8
		}
		System.out.println(reverse);
			}

	}

