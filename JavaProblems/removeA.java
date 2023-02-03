package JavaProblems;
//recursion can be 
// 1. passing the ans in the arguemnt 
// 2. creating the ans in the function body, if create ans in the function body then return current ans + {return value from next recursive call}

public class removeA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "baccad";
String ans= remover2(a,0  );
System.out.print(ans);
	}
	
	public static String remover(String s, int start, String ans) {
		
		if(start==s.length()) {
			return ans;
		}
		
		if(s.charAt(start)!='a') {
			ans+=s.charAt(start);	
		}
		
		return remover(s, start+1, ans);
	}
	
	
public static String remover2(String s, int start ) {
		String ans= new String();
		if(start==s.length()) {
			return ans;
		}
		
		if(s.charAt(start)!='a') {
			ans+=s.charAt(start);	
		}
		
		return ans+remover2(s, start+1 );
	}
	
	

}
