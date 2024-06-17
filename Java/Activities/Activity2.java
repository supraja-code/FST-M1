package activities;

public class Activity2 {
	
	public static void main(String[] args) {
		int[] array = {10,77,10,54,-11,10};
		
		int searchNo = 10;
		int sum = 0;
		int targetSum = 30;
		
		for(int number: array) {
			if(number == searchNo) {
				sum += 10;
			}
		}
		
		if(sum == targetSum) {
			System.out.println("sum of 10's in array is: " + sum);
		}else {
			System.out.println("sum of 10's in array is: " + sum);
		}
		
	}

}
