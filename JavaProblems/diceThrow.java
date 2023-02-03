package JavaProblems;
import java.util.*;
public class diceThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		int ans = rollHelp2("", 1,6, 3);
		System.out.println(ans);
	
	}
     static void numRollsToTarget(String up, int target){
    	 if(target==0) {
    		 System.out.println(up);
    		 return;
    	 }
    	 
    	 for(int i =1;i<=6 && i<=target;i++) {
    		 numRollsToTarget(up+i, target-i);
    	 }
        
    }
     
     static int rollHelp2(String up, int n, int k ,int target) {
    	 if(target==0) {
    		 System.out.println("This is "+up);
    		
    		 return 1;
    	 }
    	 int count=0;
    	 for(int i=1;i<=n;i++) {
    		 for(int j=1;j<=k && j<=target;j++) {
    			count+= rollHelp2(up+j,n,k, target-j);
    		 }
    	 }
    	 return count;
     }

}
