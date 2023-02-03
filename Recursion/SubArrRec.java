package Recursion;
import java.util.*;

public class SubArrRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3, 4};
		ArrayList<ArrayList<Integer>> a = recSubArr(arr, 0, new ArrayList<ArrayList<Integer>>());
		for(List b:a) {
			System.out.println(b);
		}

	}
	public static ArrayList<ArrayList<Integer>> recSubArr(int[] arr, int index, ArrayList<ArrayList<Integer>>list) {
		if(index==arr.length) {
		 return list;
		}
		
		for(int j= 0;j<arr.length;j++) {
			ArrayList<Integer>temp= new ArrayList<>();
			for(int start=index;start<=j;start++ ) {
//				System.out.print(arr[start]);
				temp.add(arr[start]);
			}
		   
			if(temp.size()>=3)list.add(temp);
		}
		return recSubArr(arr, index+1, list);
		 
	}

}
