package JavaProblems;


public class DigitSum {

	public static void main(String[] args) {
		  String ans= digitsum("11111222223", 3);
		  System.out.print(ans);

	}
       public static  String digitsum(String s, int k) {
        	
        	 if(s.length()<=k) {
        		 return s;
        	 }
        	 String ans= "";
        	 
        	 for(int i =0;i<s.length();i=i+k) {
        		 int sum =0;
        		 for(int j = i;j<i+k && j<s.length();j++) {

        			 sum+=s.charAt(j)-'0';
        		 }
        		 ans+=sum;
        	 }
        	 return digitsum(ans, k);
        
         }
        
        
}
