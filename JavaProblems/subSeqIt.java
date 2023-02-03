package JavaProblems;
import java.util.*;

public class subSeqIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p= {1,2,3};
		List<List<Integer>>ans=  subSeqRec(p, 0, new ArrayList<>() );
		for(List<Integer> l:ans) {
			System.out.println(l);  
		}

	}
	static List<List<Integer>> subset(int[] arr){
		List<List<Integer>>outerAns= new ArrayList<>();
		outerAns.add(new ArrayList<>()); //first add empty list in the answer
		
		for(int num:arr) {
			int si= outerAns.size();
			for(int i = 0 ;i<si;i++) {
				List<Integer>inner= new ArrayList<>(outerAns.get(i));
				inner.add(num);
				outerAns.add(inner);
			}
		}
		return outerAns;
	}
	
//	if array contains duplicates like this 
	static List<List<Integer>> subsetDuplicate(int[] arr){
//		duplicates should be together 
		Arrays.sort(arr);
		List<List<Integer>>outerAns= new ArrayList<>();
		outerAns.add(new ArrayList<>()); //first add empty list in the answer
		int start = 0;
		int end =0;
		
		
		for(int i=0;i<arr.length;i++) {
//			if current and previous element is same, next start= prev end+1
			if(i>0 && arr[i]==arr[i-1]) {
				start=end+1;
			}
			end= outerAns.size()-1;
			int si= outerAns.size();
			for(int j = start ;j<si;j++) {
				List<Integer>inner= new ArrayList<>(outerAns.get(j));
				inner.add(arr[i]);
				outerAns.add(inner);
			}
		}
		return outerAns;
		
	}
	//index represents current position 
	public static List<List<Integer>> subSeqRec(int[] base, int index, List<Integer>uproc){
		if(index==base.length) {//base case 
			List<List<Integer>>p=new ArrayList<>();
			List<Integer>l= new ArrayList<>(uproc);
			p.add(l);
			return p;
		}
		int element = base[index];
		
		List<List<Integer>>left= subSeqRec(base, index+1, uproc );//don't select 
		uproc.add(element);
		List<List<Integer>>right= subSeqRec( base, index+1, uproc );//select
		uproc.remove(uproc.size()-1);
		left.addAll(right);
		return left;
		
		
	}
	 

}
