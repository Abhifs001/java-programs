package Recursion;

import java.util.ArrayList;

public class backTrack {

	public static void main(String[] args) {
		boolean[][] maze= {
				{true, true, true},
				{true, true, true},
				{true, true, true}
		};
		System.out.println(allPathMaze("", maze, 0, 0));
	}
	//function that includes all the paths u, down, right, left will give stack overflow error because recursion is never ending, to solve this problem, mark the visited cells as false so that repetition is not done
	
	// marking a cell means I have that cell in the current path, but not in all the paths 
	// while moving back i.e. when the path is over, restore the maze as it is and mark the cell true again
	
	//this is the reason we need backtracking 
	// it typically says that when you return from the below recursion calls, the changes made by them should be restored 
	// thought process is make a change and reverse the change after a function call 
	static ArrayList<String> allPathMaze(String path, boolean[][] maze, int r, int c) {
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
		// mark the cells as visited 
		maze[r][c]= false;
		if(r<maze.length-1) {
			list.addAll(allPathMaze(path+"D", maze, r+1, c));
			
		}
		if(c<maze[0].length-1) {
			list.addAll(allPathMaze(path+"R", maze, r, c+1));
		}
		
		if(r>0) {
			 // this is for up 
			list.addAll(allPathMaze(path+"U", maze, r-1, c));
		}
		
		if(c>0) {
			// this is for left
			list.addAll(allPathMaze(path+"L", maze, r, c-1));
		}
		
		//this is when function will end so 
		// restore the maze as it is and mark the cells true again 
		//imagine what would happen if you would not have visited the cell, so mark it true 
		
		maze[r][c]=true;
		return list;
	}

}
