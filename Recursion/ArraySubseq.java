package Recursion;
import java.util.*;

public class ArraySubseq {
    public static ArrayList<ArrayList<Integer>>ans= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3};
		subSeq(arr, new ArrayList<>(), 0);

	}
	static void subSeq(int[] base, ArrayList<Integer> proc, int index) {
		//if you reached arrays end, then include the subarray in answer and print
		if(index==base.length) {
			//print empty array if subarray is empty
			if(proc.size()==0) {
				System.out.println("[]");
			}else {
				System.out.println(proc);
//				ans.addAll(proc);
			}
		}else {
			//call without including 
			subSeq(base, proc, index+1);
			//call with including the element 
			proc.add(base[index]);
			subSeq(base, proc, index+1);
			proc.remove(proc.size()-1);
		}
		return;
		
		
	}

}
