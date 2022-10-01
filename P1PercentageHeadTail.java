package Day5;

import java.util.Random;

public class P1PercentageHeadTail {
	public static void main(String[] args) {
		 Random r = new Random(); 
	        int ran1 = r.nextInt(2);
	        int ran2 = r.nextInt(2);
	        int ran3 = r.nextInt(2);
	        int ran4 = r.nextInt(2);
	        int ran5 = r.nextInt(2);
	        float sum=ran1+ran2+ran3+ran4+ran5;
	        float avg=sum/5;
	        System.out.println(sum);
	        System.out.println(avg);
	        if(avg<0.5) {
	        	System.out.println("tails");
	        }
	        else {
	        	System.out.println("Head");
	        }
	        
}
}
