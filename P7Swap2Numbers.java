package Day5;

import java.util.Scanner;

public class P7Swap2Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int a=sc.nextInt();
		System.out.print("Enter num2: ");
		int b=sc.nextInt();
		int c;
		System.out.println("two numbers are a="+a+ " & b=" +b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping: a="+a+" & b="+b);
		sc.close();
	}
}
