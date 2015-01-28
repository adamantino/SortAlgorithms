import java.util.Random;

import Algorithms.BoubleSort;
import Algorithms.CountingSort;
import Algorithms.InsertionSort;
import Algorithms.MergeSort;
import Algorithms.QuickSort;
import Common.UtilitiesFunctions;


public class Main {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int size = 20;
		int arrayr[] = new int[size];
		
		int maxElement = Integer.MIN_VALUE;
		

		for (int i = 0; i < arrayr.length; i++) {
			arrayr[i] = random.nextInt(100);
			if(arrayr[i] > maxElement) maxElement = arrayr[i];
		}	
		
		
<<<<<<< HEAD
		int[] sortedArrayInsertionSort = InsertionSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArrayMergeSort = MergeSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArrayBoubleSort = BoubleSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArrayBoubleSortOptimized = BoubleSort.sortOptimizedVersion(UtilitiesFunctions.copy(buffer));
		int[] sortedArraySequentialSort = BoubleSort.sort(UtilitiesFunctions.copy(buffer));
		int[] sortedArrayCountingSort = CountingSort.sort(UtilitiesFunctions.copy(buffer), maxElement);
=======
		int[] sortedArrayInsertionSort = InsertionSort.sort(UtilitiesFunctions.copy(arrayr));
		int[] sortedArrayMergeSort = MergeSort.sort(UtilitiesFunctions.copy(arrayr));
		int[] sortedArrayBoubleSort = BoubleSort.sort(UtilitiesFunctions.copy(arrayr));
		int[] sortedArraySequentialSort = BoubleSort.sort(UtilitiesFunctions.copy(arrayr));
		int[] sortedArrayCountingSort = CountingSort.sort(UtilitiesFunctions.copy(arrayr), maxElement);
		int[] sortedArrayQuickSort = QuickSort.sort(UtilitiesFunctions.copy(arrayr));
>>>>>>> origin/master
		
	
		UtilitiesFunctions.printArray("Array", arrayr);
		UtilitiesFunctions.printArray("InsertionSort", sortedArrayInsertionSort);
		UtilitiesFunctions.printArray("MergeSort", sortedArrayMergeSort);
		UtilitiesFunctions.printArray("BoubleSort", sortedArrayBoubleSort);
		UtilitiesFunctions.printArray("BoubleSortOptimizedVersion", sortedArrayBoubleSortOptimized);
		UtilitiesFunctions.printArray("SequentialSort", sortedArraySequentialSort);
		UtilitiesFunctions.printArray("CountingSort", sortedArrayCountingSort);
		UtilitiesFunctions.printArray("QuickSort", sortedArrayQuickSort);

		
	}

}
