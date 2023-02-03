package JavaProblems;
import java.util.*;
public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>arr= new ArrayList<>();
for(int i=1;i<=6;i++) {
	arr.add(i);
}
   combinationhelp(arr, 4,0, new ArrayList<>());
 

	}
	
	
	
static void combinationhelp(ArrayList<Integer>arr,  int target,int index, ArrayList<Integer>subset){
        
        //base case will be when the target is equal to 0 while reaching to end of the list 
        if(index==arr.size()){
            if(target==0)
           System.out.println(subset); // add the subset in the answer- copy is generated 
          return;
        }
        
        if(arr.get(index)<=target){
            subset.add(arr.get(index));
             combinationhelp(arr,  target-arr.get(index) , index, subset);
            subset.remove(subset.size()-1);// if target is not equal to 0 then remove the last element and try with another element
            
            
        }
        
        combinationhelp(arr,  target, index+1,subset);
        
        
        
    }

}
