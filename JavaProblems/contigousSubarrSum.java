package JavaProblems;

public class contigousSubarrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0};
//		System.out.print(1%13);
		boolean answer =  checkSubarraySum( arr, 2);
		System.out.print(answer);

	}
	static boolean checkSubarraySum(int[] nums, int k) {
		 
        for(int i =0;i<nums.length;i++){
            int sum=0;
            
            for(int start = i ;start<nums.length;start++){
                sum=sum+nums[start];
               if(sum%k==0){
                   return true;
               }  
           }
            System.out.println(sum);
        }
        return false;
    }

}
