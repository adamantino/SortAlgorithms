package Common;

public class UtilitiesFunctions {
	
	public static int[] copy(int[] array){
		int[] copy = new int[array.length];
		
		for (int i = 0; i < copy.length; i++) {
			copy[i] = array[i];
		}
		
		return copy;
	}

}
