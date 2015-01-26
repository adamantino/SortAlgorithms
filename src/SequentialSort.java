
public class SequentialSort {
	
	public static int[] sort(int[] array){
		
		for (int i = 0; i < array.length; i++) {
			int maxElemnent = Integer.MIN_VALUE;
			int index = i;
			for (int j = 0; j < array.length - i; j++) {
				if(array[j] > maxElemnent){
					maxElemnent = array[j];
					index = j;
				}
			}
			array[index] = array[array.length - i - 1];
			array[array.length - i - 1] = maxElemnent;
		}
		
		return array;
	}

}
