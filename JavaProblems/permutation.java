package JavaProblems;
import java.util.*;
// print permutations in a string, this will also work for duplicates 
// space complexity O(n*n!)
// time complexity- O(n*n!)

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abc";
		List<String>answer = permutation(a);
		
		for(String i:answer) {
			System.out.println(i);
		}

	}
	
	static List<String> permutation(String s) {
		return recPer("", s);
		
	}
	
	static List<String> recPer(String up, String base) {
		if(base.isEmpty()) {
			List<String>p= new ArrayList<>();
			p.add(up);
             return p;
		}
		List<String>ans= new ArrayList<>();
		Set<String>temp= new HashSet<>();
		char c= base.charAt(0);
		for(int i=0;i<=up.length();i++) {
			String f= up.substring(0,i);
			String s= up.substring(i, up.length());
			temp.addAll(recPer(f+c+s, base.substring(1)));
			ans.addAll(temp);
		}
		
		return ans;
		
	}

}
