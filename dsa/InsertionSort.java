package dsa;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 11, 13, 5, 6};
		insertSort(arr );
		System.out.println("Sorted array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	static void insertSort(int[] arr) {
		//start from index 1
		for(int i=1;i<arr.length;i++) {
			//make key= arr[i] so that each element can be compared to key 
			int key=arr[i];
			int index=i-1;
			 
			while(index>=0 && (arr[index]> key )) {
				//move current element until it becomes smaller than key element
				arr[index+1] = arr[index];
				index--;
			}
			//store the key element at position next to current index
			arr[index+1]=key;
			
		}
		
	}

}
