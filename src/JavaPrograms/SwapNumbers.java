package JavaPrograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
//		int b, a;
//		Scanner s1 = new Scanner(System.in);
//		System.out.println("Enter the value in a:");
//		a = s1.nextInt();
//		Scanner s2 = new Scanner(System.in);
//		System.out.println("Enter the 2nd Number:");
//		b = s2.nextInt();
//		a = a + b; // 1,2 a=3
//		b = a - b;// 3-2=1
//		a = a - b;// 3-1=2
//		System.out.println("swap no of a:" + a);
//		System.out.println("swap no of b:" + b);

//		int a= 10;
//		int b= 20;
//		int c= a;
//		a= b;
//		b= c;
//		System.out.println("Value of a:" +a);
//		System.out.println("Value of b:" +b);

		int a, b;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the value of b:");
		b = s2.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a:" +a);
		System.out.println("Value of b:"+b);

	}

}
