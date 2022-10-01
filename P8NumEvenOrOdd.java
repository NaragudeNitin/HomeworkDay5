package Day5;

import java.util.Scanner;

public class P8NumEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Number to check whether it is even or add");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		sc.close();
	}
}
