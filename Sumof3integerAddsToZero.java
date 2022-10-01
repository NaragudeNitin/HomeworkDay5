package functionalPrograms;

public class Sumof3integerAddsToZero {
	public static void main(String[] args) {

		int arr[] = {3,1,-7,-4, -5, 9, 10};
		for (int i = 0; i < arr.length; i++) {
			int firstnum=arr[i];
			for (int j = i+1; j < arr.length; j++) {
				int secnum=arr[j];
				for (int k = j+1; k < arr.length; k++) {
					int thirdnum=arr[k];
					int sum=firstnum+secnum+thirdnum;
					 if(sum==0) {
						 System.out.print(firstnum+", "+ secnum +", "+thirdnum);
						 System.out.println(" gives you sum zero from array");
					 }
				}
			}
		}
	}
}
