package Common;

public class UtilitiesFunctions {
	
	public static int[] copy(int[] array){
		int[] copy = new int[array.length];
		
		for (int i = 0; i < copy.length; i++) {
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	public static void printArray(String arrayName, int[] array){
		System.out.println("\n\n" + arrayName);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
