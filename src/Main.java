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
		int[] sortedArrayBoubleSortOptimized = BoubleSort.sortOptimizedVersion(UtilitiesFunctions.copy(buffer));
		int[] sortedArraySequentialSort = BoubleSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArrayCountingSort = CountingSort.sort(UtilitiesFunctions.copy(buffer), maxElement);
		
	
		UtilitiesFunctions.printArray("Buffer", buffer);
		UtilitiesFunctions.printArray("InsertionSort", sortedArrayInsertionSort);
		UtilitiesFunctions.printArray("MergeSort", sortedArrayMergeSort);
		UtilitiesFunctions.printArray("BoubleSort", sortedArrayBoubleSort);
		UtilitiesFunctions.printArray("BoubleSortOptimizedVersion", sortedArrayBoubleSortOptimized);
		UtilitiesFunctions.printArray("SequentialSort", sortedArraySequentialSort);
		UtilitiesFunctions.printArray("CountingSort", sortedArrayCountingSort);

		
	}

}
