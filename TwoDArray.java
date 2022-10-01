package functionalPrograms;

public class TwoDArray {
	public static void main(String[] args) {
		double[][] intArr= {{1,2,3},{2.2,1.3,2.4},{1,0,0}};
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(intArr[i][j]+" ");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		}
	}