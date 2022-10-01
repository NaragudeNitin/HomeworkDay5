package Day5;

import java.util.Random;

public class P1PercentageHeadTailProgram {
	public static void main(String[] args) {
		 Random num = new Random();
		 float sum=0;
		 float avg;
		 
	      int res;
	      for ( int i = 1; i <= 5; i++ ) {
	         res = num.nextInt( 2 );
	         sum=sum+res;
	         System.out.print(  res + " " );
	      }
	      System.out.println();
	      System.out.println(sum);
	      avg=sum/5;
	      System.out.println(avg);
	      float percentage=avg*100;
	      System.out.println("Your prcentage of getting head is "+ percentage);
	      System.out.println("Your prcentage of getting tail is "+ (100-percentage));
	      System.out.println("Therfore your result is: ");
	      if(avg<0.5) {
	    	  System.out.println("tails");
	      }
	      else {
	    	  System.out.println("Heads");
	      }
	}
}
