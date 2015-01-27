package Algorithms;

public class InsertionSort {
	
	public static int[] sort(int[] array){
		
		int j;
		
		for (int i = 0; i < array.length; i++) {
			j=i;
			while((j>0) && (array[j]<array[j-1])){
				swap(array, i, j);
				j--;
			}
		}
		
		return array;
	}
	
	private static void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
