package JavaProblems;
import java.util.*;
public class stringSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "abfef";
		ArrayList<String>ans= recPrint1("", a);
		System.out.print(ans);
	}
	
	public static void recPrint(String uproc, String base) {
//   base case will when my base string is empty means all chars are exhausted
		
		if(base.isEmpty()) {
			System.out.println(uproc);
			return;
		}
		char c= base.charAt(0);
//		two cases are either include or ignore it 
		recPrint(uproc+c, base.substring(1));
		recPrint(uproc, base.substring(1));
	}
	static ArrayList<String> recPrint1(String uproc, String base){
		if(base.isEmpty()) {
			ArrayList<String>p= new ArrayList<>();
			p.add(uproc);
			return p;
		}
		
		char c= base.charAt(0);
//		two cases are either include or ignore it 
		ArrayList<String>left = recPrint1(uproc+c, base.substring(1));
		ArrayList<String>right = recPrint1(uproc, base.substring(1));
		left.addAll(right);
		return left;
	}
	
	 

}
