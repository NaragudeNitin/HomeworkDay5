package Day5;

import java.util.Scanner;

public class P6ComputeQuotientReminder {
	
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int num = sc.nextInt();
		System.out.println("Enter divisor: ");
		int divi=sc.nextInt();
		int quotient=num/divi;
		int remai=num%divi;
		System.out.println("Quotient: " + quotient);
		System.out.print("Remender: " + remai);
		sc.close();
	}
}
