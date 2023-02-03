package dsa;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,1,3,10,13};
		bubSortRec(arr, arr.length);
		System.out.println("Sorted array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	static void bubSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j = 1;j<arr.length-1-i;j++) {
				if(arr[j-1]>arr[j]) {
					int t= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
				}
				
				
			}
		}
	}
	
	static void bubSortRec(int[] arr, int len ) {
		//base case: if array length is one than return
		
		if(len ==1)return;
		
		// check for the elements till len. At the end of below loop, greatest number will be at the last position, so in next iteration check till n-1 (passed in function call)
		for(int i=1;i<len;i++) {
			if(arr[i-1]>arr[i]) {
				int t= arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=t;
			}
		}
		
		//Recursive call 
		bubSortRec(arr, len-1);
	}

}
