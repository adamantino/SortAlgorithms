package Algorithms;

public class CountingSort {
	
	public static int[] sort(int[] array, int maxElement){
		
		int[] count = new int[maxElement+1];

		for (int i = 0; i < array.length; i++) {
			count[array[i]]++;
		}

		int index = 0;

		for (int i = 0; i <= maxElement; i++) {
			for (int j = 0; j < count[i]; j++) {
				array[index] = i;
				index = index+1;
			}
		}
		return array;
	}

}
