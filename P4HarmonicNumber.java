package Day5;

import java.util.Scanner;

public class P4HarmonicNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of n to find harmonic number:: ");
		int n= sc.nextInt();
		double sum=0;
		for (double i = 1; i <=n ; i++) {
			sum= sum + 1/i;
			System.out.println(sum);
		}
		sc.close();
	}
}
