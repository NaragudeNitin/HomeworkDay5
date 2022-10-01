package Day5;

import java.util.Scanner;

public class P2LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = sc.nextInt();

		if (((year % 4 == 0) || (year % 4 == 0)) && (year >= 1000)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not leap year.");
		}
		sc.close();

	}
}
