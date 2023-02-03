package Recursion;

public class RecIntro {

	public static void main(String[] args) {
		// this is the basic recursion problem of fibonacci numbers 
		//print fibonacci series till n using recursion 
		
//		System.out.println(0);
//		System.out.println(1);
		int nun = fiboHelp(10);
		System.out.println(nun);
		

	}
	static void printFab(int first, int last, int start, int n) {
		
		if(start==n) {
			return;
		}
		
		int sum=first + last;
	System.out.println(sum);//current number
		
		printFab(last, sum, start+1, n);
		
		
	}
static int printFab2(int first, int last, int start, int n) {
		
		if(start==n) {
			return last ;
		}
		
		int sum=first + last;
//	System.out.println(sum);//current number
		
		return printFab2(last, sum, start+1, n);
		
		
	}
    static int fiboHelp(int n){
    if(n<2)return n;
    return fiboHelp(n-1)+fiboHelp(n-2);
}


}
