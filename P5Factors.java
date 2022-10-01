package Day5;

import java.util.Scanner;

public class P5Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find  its factors:: ");
		int num = sc.nextInt();
		System.out.println("So prime factors are");
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num = num / i;
				System.out.print(i + " ");
			}
		}
		sc.close();
//			System.out.println(fact);
	}
}
