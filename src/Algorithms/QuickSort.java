package Algorithms;
import java.util.ArrayList;

public class QuickSort {


	private static int partition(int[] array){
		int l = 0;
		int r = array.length - 1;
		int pivot = array[0];

		while(l<r){
			do{
				r--;
			}while(array[r] > pivot && r>l);

			if(l!=r){
				do{
					l++;
				}while(array[l] <= pivot && l<r);
				swap(array, l, r);
			}
		}
		return l+1;
	}

	private static int[] swap(int[] array, int i1, int i2){
		int tmp = array[i1];
		array[i1] = array[i2];
		array[i2] = tmp;
		return array;
	}

	private static int[] leftPartition(int[] array, int index) {
		int[] leftPartition = new int[index-1];
		for (int i = 0; i < leftPartition.length; i++) {
			leftPartition[i] = array[i];
		}
		return leftPartition;
	}

	private static int[] rightPartition(int[] array, int index){
		int[] rightPartition = new int[array.length - index];
		for (int i = 0; i < rightPartition.length; i++) {
			rightPartition[i] = array[index + i];
		}
		return rightPartition;
	}

	public static int[] sort(int[] array){
		if(array.length > 1){
			int iPivot = partition(array);
			sort(leftPartition(array, iPivot));
			sort(rightPartition(array, iPivot));
		}
		return array;
	}











	






	public static ArrayList<Integer> quicksort(ArrayList<Integer> numbers) {
		if (numbers.size() <= 1)
			return numbers;
		int pivot = numbers.size() / 2;
		ArrayList<Integer> lesser = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();
		int sameAsPivot = 0;
		for (int number : numbers) {
			if (number > numbers.get(pivot))
				greater.add(number);
			else if (number < numbers.get(pivot))
				lesser.add(number);
			else
				sameAsPivot++;
		}
		lesser = quicksort(lesser);
		for (int i = 0; i < sameAsPivot; i++)
			lesser.add(numbers.get(pivot));
		greater = quicksort(greater);
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		for (int number : lesser)
			sorted.add(number);
		for (int number: greater)
			sorted.add(number);
		return sorted;
	}


	public static int[] quicksort2(int[] numbers) {
		if (numbers.length <= 1)
			return numbers;
		int pivot = numbers.length / 2;
		ArrayList<Integer> lesser = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();
		int sameAsPivot = 0;
		for (int number : numbers) {
			if (number > numbers[pivot])
				greater.add(number);
			else if (number < numbers[pivot])
				lesser.add(number);
			else
				sameAsPivot++;
		}
		lesser = quicksort(lesser);
		for (int i = 0; i < sameAsPivot; i++)
			lesser.add(numbers[pivot]);
		greater = quicksort(greater);
		int[] sorted = new int[numbers.length];
		int count = 0;
		for (int number : lesser){
			sorted[count++] = number;
		}
		for (int number: greater)
			sorted[count++] = number;
		return sorted;
	}
}

