package dsa;

import java.util.Arrays;

public class Sorting {

	static int partition(int arr[], int low, int high) {
		int pivot = arr[low]; // selecting first element as pivot element
		int i = low;
		int j = high;
		int temp; // temporary variable for swapping

		while (i < j) {

			while (arr[i] <= pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}
			// swapping
			if (i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
		arr[low] = arr[j];
		arr[j] = pivot;

		return j;

	}

	static void quickSort(int arr[], int low, int high) {

		if (low < high) {
			int locationOfPivot = partition(arr, low, high);
			quickSort(arr, low, locationOfPivot - 1); // recursive call to left sub-array
			quickSort(arr, locationOfPivot + 1, high); // recursive call to right sub-array
		}
	}

	public static void main(String[] args) {

		int[] arr = { 9, 14, 6, 1, 7, 11, 3, 5 };
		quickSort(arr, 0, 7);

		System.out.println("Array after applying Quick Sort: " + Arrays.toString(arr));
	}
}
