package Day5;

import java.util.Scanner;

public class P3Power2 {
	public static void main (String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter Base: ");
	    int base= sc.nextInt();
	    System.out.print("Enter power");
	    int pow=sc.nextInt();
	    int res=1;
	    
	    while(pow!=0){
	        res=res*base;
	        System.out.println(res);
	        pow--;
	    }
	    sc.close();
}
}