package functionalPrograms;

import java.util.Scanner;
import java.lang.Math;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		int a= sc.nextInt();
		System.out.print("b= ");
		int b = sc.nextInt();
		System.out.print("c= ");
		int c = sc.nextInt();
		int delta= b*b-4*a*c;
		int root1=(int) ((-b+Math.sqrt(delta))/2*a);
		int root2=(int) ((-b-Math.sqrt(delta))/2*a);
		System.out.println("Roots of eq are: "+root1+" & "+root2);
		sc.close();
	}
}
