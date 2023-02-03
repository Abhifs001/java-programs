package JavaProblems;
import java.util.*;
public class subSetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		List<Integer>p= new ArrayList<>();
		for(int i:arr) {
			p.add(i);
		}
//		for(int i:p) {
//			 System.out.print(i);
//		}
		List<Integer>up= new ArrayList<>();
		helper(up, p, 0);
//		System.out.print(up);

	}
	static void helper(List<Integer>up, List<Integer>base, int index) {
		 if(index==base.size()) {
               System.out.println(up);
			 return ;
		 }
		 
		 int temp= base.get(index);
//		 System.out.println(baseT+" this is base array");
		 helper(new ArrayList<>(up), base, index+1 );
		 up.add(temp);
		 helper(new ArrayList<>(up), base, index+1 );
		 
		 

		
	}

}
