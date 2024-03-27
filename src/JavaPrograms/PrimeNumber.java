package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i;
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = s.nextInt();// 5
		if (num == 1) {
			System.out.println("smallest prime no is 2");
		}
		for (i = 2; i < num ; ++i) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count == 0) {

			System.out.println("prime");

		} else {
			System.out.println("Not Prime");
		}

	}
}


