import java.util.Random;


public class Main {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int size = 20;
		int buffer[] = new int[size];
		
		int maxElement = Integer.MIN_VALUE;
		

		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = random.nextInt(100);
			System.out.print(buffer[i] + " ");
			if(buffer[i] > maxElement) maxElement = buffer[i];
		}	
		
		
		int[] sortedArrayInsertionSort = InsertionSort.sort(buffer);
		System.out.println("\nbuffer:");
		for (int i = 0; i < buffer.length; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println("\nInsertionSort:");
		for (int i = 0; i < sortedArrayInsertionSort.length; i++) {
			System.out.print(sortedArrayInsertionSort[i] + " ");
		}
		
		System.out.println();
		int[] sortedArrayMergeSort = MergeSort.sort(buffer);
		for (int i = 0; i < buffer.length; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println("\nMergeSort:");
		for (int i = 0; i < sortedArrayMergeSort.length; i++) {
			System.out.print(sortedArrayMergeSort[i] + " ");
		}
		int[] sortedArrayBoubleSort = BoubleSort.sort(buffer);
		int[] sortedArraySequentialSort = BoubleSort.sort(buffer);
		int[] sortedArrayCountingSort = CountingSort.sort(buffer, maxElement);
		
		
		
		
		

		
		
		System.out.println("\nBoubleSort:");
		for (int i = 0; i < sortedArrayBoubleSort.length; i++) {
			System.out.print(sortedArrayBoubleSort[i] + " ");
		}
		
		System.out.println("\nSequentialSort:");
		for (int i = 0; i < sortedArraySequentialSort.length; i++) {
			System.out.print(sortedArraySequentialSort[i] + " ");
		}
		
		System.out.println("\nCountingSort:");
		for (int i = 0; i < sortedArrayCountingSort.length; i++) {
			System.out.print(sortedArrayCountingSort[i] + " ");
		}
	}

}
