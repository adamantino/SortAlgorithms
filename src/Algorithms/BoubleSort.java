package Algorithms;

public class BoubleSort {
	
	public static int[] sort(int[] array){
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		return array;
	}
	
	
	public static int[] sort2(int[] array){
		
		int i = 0;
		boolean swapPerformed = true;
		
		while(i <= array.length && swapPerformed == true){
			swapPerformed = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					swapPerformed = true;
				}
			}
			i++;
		}
		
		return array;
	}

}
