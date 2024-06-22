package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] array = {4,8,2,1,7};
		int temp = 0;
		
		System.out.println("Array before sort");
		System.out.println(Arrays.toString(array));
		
		for(int i = 0; i < array.length;i++) {
			for(int j = i+1; j<array.length; j++)
				
			if(array[i] > array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
		}
				
		System.out.println("Array after sort");
		System.out.println(Arrays.toString(array));
	}

}
