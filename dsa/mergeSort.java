package dsa;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 11, 13, 5,3,2,16, 9};
		mSort(arr);
		System.out.println("Sorted array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	//merge sort comprises of a sort function and a merge function 
	static void mSort(int[] arr) {
		sort(arr, 0, arr.length-1);
		
	}
	
	//defining the sort functiom
	static void sort(int[] arr, int left, int right) {
		if(left<right) {
			int mid= (left+right)/2;
			//recursive call to sort two halves 
			sort(arr, left, mid); //first subarray
			sort(arr, mid+1, right);//second subarray
			
			//then merge two sorted subarrays
			
			merge(arr,left,mid,right );
		}
	}
		
	//defining the merge function	
		static void merge(int[] arr, int left, int mid, int right) {
			int[] temp= new int[arr.length];
			int L=left, R=mid+1;
			int index=0;
			
			while(L<=mid && R <=right) {
				if(arr[L]<arr[R]) {
					//if left element small then insert first element
					temp[index++]=arr[L++];
				}else {
					//right element is small so, insert right element
					temp[index++]=arr[R++];
				}
			}
			
			while(L<=mid) {
				temp[index++]=arr[L++]; 
			}
			while(R<=right) {
				temp[index++]=arr[R++]; 
			}
			int k=0;
			for(int i=left;i<=right;i++) {
				arr[i]=temp[k++];
			}
		}
		
 

}
