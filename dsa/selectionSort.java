package dsa;

public class selectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int[] arr = {64,25,12,22,11};
		selSort(arr );
		System.out.println("Sorted array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	static void selSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i; //assume that first element is on index 1
			
			for(int current =i+1;current<arr.length;current++) {
				// if current element is minimum than assumed, current becomes minimum
				if(arr[current]<arr[minIndex])minIndex=current;	
			}
			//swap the new minimum with first element 
			int t = arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=t;
		}
		
	}

}
