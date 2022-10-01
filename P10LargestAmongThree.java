package Day5;

import java.util.Scanner;

public class P10LargestAmongThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("First Number: ");
		int num1= sc.nextInt();
		System.out.print("Second Number: ");
		int num2 = sc.nextInt();
		System.out.print("Third Number: ");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is grater than " + num2 + " " +num3);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " is grater than " + num1 + " " +num3);
		}
		else {
			System.out.println(num3 + " is grater than " + num1 + " " +num2);
		}
		sc.close();
	}
}
