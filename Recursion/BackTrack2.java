package Recursion;
import java.util.*;

public class BackTrack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze= {
				{true, true, true},
				{true, true, true},
				{true, true, true}
		};
		int[][] matrix= new int[maze.length][maze[0].length];
		allPathPrint("", maze, 0,0, matrix, 1);

	}
static void allPathPrint(String path, boolean[][] maze, int r, int c, int[][] matrix, int step){
		
	if(r==maze.length-1 && c==maze.length-1) {
		//base case 
		matrix[r][c]=step;
		for(int[] arr:matrix) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(path);
		return;
	}
	if(!maze[r][c]) {
		return;
	}
	// consider this block and mark as visited 
	maze[r][c]=false;
	//add the number in the path matrix 
	matrix[r][c]=step;  
	
	// down direction 
	if(r<maze.length-1) {
		allPathPrint(path+"D->",maze, r+1, c, matrix, step+1);
		
	}
	
	//right direction 
	if(c<maze[0].length-1) {
		allPathPrint(path+"R->",maze, r, c+1, matrix, step+1);
	}
	
	//up direction 
	if(r>0) {
		allPathPrint(path+"U->",maze, r-1, c, matrix, step+1);
	}
	//left direction 
	if(c>0) {
		allPathPrint(path+"L->",maze, r, c-1, matrix, step+1);
	}
	// this is where function add now restore the changes made 
	//mark the cell true and remove the number from the path matrix 
	
	
	maze[r][c]=true;
	matrix[r][c]=0;
	return;
		
	}

}
