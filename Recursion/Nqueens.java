package Recursion;

public class Nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean[][] board= new boolean[n][n];
		int ans= nQueen(board, 0);
		System.out.println ("The number of ways of placing a queen is "+ ans);

	}
	public static int nQueen(boolean[][] board, int row) {
		if(row==board.length) {
			display(board);
			System.out.println();
			return 1; //found 1 answer hence return 1
		}
		
		
		int count=0;
		for(int col=0;col<board.length;col++) {
			//add the answers for sub-matrix in count if placing the queen is safe for 
			if(isSafe(board, row, col)) {
				board[row][col]=true;
				count+=nQueen(board, row+1);
				board[row][col]=false;//undo changes of recursive call(backtrack)
				
			}
		}
		
		return count;
	}
	public static boolean isSafe(boolean[][] board, int row, int col) {
		//check vertically , if queen is already placed then not safe 
		for(int i=0;i<row;i++) {
			if(board[i][col]) {
				return false;
			}
		}
		
		
		//check left diagonally 
		int maxLeft= Math.min(row, col);
		for(int i=1;i<=maxLeft;i++) {
			if(board[row-i][col-i]) {
				return false;
			}
		}
		
		//check right diagonally 
		int maxRight=Math.min(row, board.length-col-1);
		for(int i=1;i<=maxRight;i++) {
			if(board[row-i][col+i]) {
				return false;
			}
		}
		
		//if none is false, queen is safe hence return true 
		
		return true;
		
	}
	
	public static void display(boolean[][] board) {
		for(boolean[] row: board) {
			for(boolean element: row) {
				if(element) {
					System.out.print("Q");
				}else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}

}
