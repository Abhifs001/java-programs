package Recursion;
import java.util.*;

public class MazeProblem {
	public static void main(String ard[]) {
		// this is a common problem there is a matrix, person is standing at top-left
		// he want to reach the bottom-right 
		//he can move either down or right
		//find the number of paths 
		
//		suppose matrix size is 3x3
//		int path=pathFind(3,7);
//		System.out.println(path);
		boolean[][] maze= {
				{true, true, true},
				{true, false, true},
				{true, true, true}
		};
		System.out.println(pathRestrictions("", maze, 0, 0));
		
	}
	//but this is inefficient because tree and repeated on the left and right subtree of the recursion tree 
	//this problem is solved using the concept of DP
	
	static int pathFind(int r, int c) {
		//suppose you want to print the path till the end point 
		// then the base case will be when both the rows and columns becomes 1;
		
		if(r==1 || c==1) {
			return 1;
		}
		//down jaega to row ghategi and left jaega to column ghahtegi
		int down=pathFind(r-1, c);
		int left= pathFind(r, c-1);
		return down+left;
	}
	static void pathFindPrint(String path, int r, int c) {
		if(r==1 &&  c==1) {
			System.out.println(path);
			return ;
		}
		
		if(r>1)pathFindPrint(path+"D", r-1, c);
		if(c>1)pathFindPrint(path+"R", r, c-1);
	}
	static ArrayList<String> pathFindPrint2(String path, int r, int c) {
		if(r==1 &&  c==1) {
			ArrayList<String>list = new ArrayList<>();
			
//			System.out.println(path);
			list.add(path);
			return list;
		}
		ArrayList<String>list= new ArrayList<>();
		if(r>1) {
			list.addAll(pathFindPrint2(path+"D", r-1, c));
			
		}
		if(c>1) {
			list.addAll(pathFindPrint2(path+"R", r, c-1));
		}
		return list;
	}
	// if person can also move diagonally then, one more recursion call will be made for the diagonal move
	static ArrayList<String> pathFindDiaog(String path, int r, int c) {
		if(r==1 &&  c==1) {
			ArrayList<String>list = new ArrayList<>();
			
//			System.out.println(path);
			list.add(path);
			return list;
		}
		ArrayList<String>list= new ArrayList<>();
		if(r>1) {
			list.addAll(pathFindDiaog(path+"D", r-1, c));
			
		}
		if(c>1) {
			list.addAll(pathFindDiaog(path+"R", r, c-1));
		}
		if(r>1 && c>1) {
			//diagonal move is not possible when either row = 1 or col = 1 thus both should be greater than 1
			list.addAll(pathFindDiaog(path+"diag", r-1, c-1));
		}
		return list;
	}
	static ArrayList<String> pathRestrictions(String path, boolean[][] maze, int r, int c) {
		if(r==maze.length-1 &&  c==maze[0].length-1) {
			ArrayList<String>list = new ArrayList<>();
			
//			System.out.println(path);
			list.add(path);
			return list;
		}
		
		ArrayList<String>list= new ArrayList<>();
		//first step is to check whether obstacles exist or not 
		if(!maze[r][c]) {
			return list;
		}
		if(r<maze.length-1) {
			list.addAll(pathRestrictions(path+"D", maze, r+1, c));
			
		}
		if(c<maze[0].length-1) {
			list.addAll(pathRestrictions(path+"R", maze, r, c+1));
		}
		
		return list;
	}

}
