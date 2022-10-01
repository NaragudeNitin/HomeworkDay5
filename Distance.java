package functionalPrograms;

import java.util.Scanner;
import java.lang.Math;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x=");
		int x = sc.nextInt();
		System.out.print("Enter y=");
		int y = sc.nextInt();
		int dist=(int) Math.sqrt(x*x+y*y);
		System.out.println("Distance of point from origin is "+dist);
		sc.close();
	}
	
}
