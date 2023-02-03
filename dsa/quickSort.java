package dsa;

import java.util.*;

public class quickSort {

	public static void main(String[] args) {

		int[] arr = { 12, 11, 13, 5, 3, 2, 16, 9, 34, 34 };
		qSort(arr, 0, arr.length - 1);
		System.out.println("Sorted array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	// defining the qSort function which sorts the divided lists
	static void qSort(int[] arr, int left, int right) {
		if (left < right) {
			int pIndex = partition(arr, left, right);
			qSort(arr, left, pIndex - 1);
			qSort(arr, pIndex + 1, right);
		}
	}

	// Partition function consider first element as pivot and divides the list
	// around it
	static int partition(int[] arr, int left, int right) {
		int pivot = arr[left];// first element as pivot

		// start comparing elements with pivot, if they are smaller then pivot then move
		// them to the left of the pivot
		int i = left;
		int j = right;

		while (i < j) {
			i++;// avoid the pivot element
			//find smaller element than pivot
			while (arr[j] > pivot) {
				j--;
			}
			//find greater element than pivot
			while (arr[i] < pivot && i < right) {
				i++;
			}
			//swap elements around pivot
			if (i < j) {
				swap(arr, i, j);

			}
		}
		//place pivot to correct position
		swap(arr, left, j);

		return j;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
