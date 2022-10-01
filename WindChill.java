package functionalPrograms;

import java.util.Scanner;
import java.lang.Math;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("t= ");
		double t = sc.nextDouble();
		System.out.print("v= ");
		double v = sc.nextDouble();
		double w;
		if ((t < 50) && (v < 120 && v > 3)) {
			w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.18);
			System.out.println("The effective Windchill is " + w);
		} else
			System.out.println("Above formula is not valid for entered input.");
		sc.close();
	}
}
