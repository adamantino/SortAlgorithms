import java.util.Random;

import Algorithms.BoubleSort;
import Algorithms.CountingSort;
import Algorithms.InsertionSort;
import Algorithms.MergeSort;
import Common.UtilitiesFunctions;


public class Main {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int size = 20;
		int buffer[] = new int[size];
		
		int maxElement = Integer.MIN_VALUE;
		

		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = random.nextInt(100);
			if(buffer[i] > maxElement) maxElement = buffer[i];
		}	
		
		
		int[] sortedArrayInsertionSort = InsertionSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArrayMergeSort = MergeSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArrayBoubleSort = BoubleSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArraySequentialSort = BoubleSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArrayCountingSort = CountingSort.sort(UtilitiesFunctions.copy(buffer), maxElement);
		
	
		System.out.println("\nArray to Sort:");
		for (int i = 0; i < buffer.length; i++) {
			System.out.print(buffer[i] + " ");
		}
		
		System.out.println("\n\nInsertionSort:");
		for (int i = 0; i < sortedArrayInsertionSort.length; i++) {
			System.out.print(sortedArrayInsertionSort[i] + " ");
		}
		
		System.out.println("\n\nMergeSort:");
		for (int i = 0; i < sortedArrayMergeSort.length; i++) {
			System.out.print(sortedArrayMergeSort[i] + " ");
		}
	
		System.out.println("\n\nBoubleSort:");
		for (int i = 0; i < sortedArrayBoubleSort.length; i++) {
			System.out.print(sortedArrayBoubleSort[i] + " ");
		}
		
		System.out.println("\n\nSequentialSort:");
		for (int i = 0; i < sortedArraySequentialSort.length; i++) {
			System.out.print(sortedArraySequentialSort[i] + " ");
		}
		
		System.out.println("\n\nCountingSort:");
		for (int i = 0; i < sortedArrayCountingSort.length; i++) {
			System.out.print(sortedArrayCountingSort[i] + " ");
		}
		
		
	}

}
