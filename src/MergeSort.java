
public class MergeSort{


	public static int[] sort(int[] array){
		if(array.length > 1){
			int[] left  = left(array);
			int[] right = right(array);

			sort(left);
			sort(right);
			
			merge(array, left, right);
		}
		return array;
	}

	private static int[] left(int[] array){
		int[] tmp = new int[array.length/2];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = array[i];
		}
		return tmp;
	}

	private static int[] right(int[] array){
		int[] tmp = new int[array.length - array.length/2];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = array[array.length/2 + i];
		}
		return tmp;
	}
	
	
	
	private static int[] merge(int[] array, int[] left, int[] right){
		int iLeft  = 0;
		int iRight = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(iRight >= right.length || (iLeft < left.length && left[iLeft] <= right[iRight])){
				array[i] = left[iLeft];
				iLeft++;
			}else{
				array[i] = right[iRight];
				iRight++;
			}
		}
		
		return array;
	}









}