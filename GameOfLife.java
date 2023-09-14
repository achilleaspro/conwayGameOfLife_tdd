package junit;

public class GameOfLife {

	    public static boolean[][] getNextGeneration(boolean[][] board) {
	        int rows = board.length;
	        int cols = board[0].length;
	        boolean[][] newBoard = new boolean[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                int liveNeighbors = countLiveNeighbors(board, i, j);
	                if (board[i][j]) {
	                    // Rule 1, 2, 3
	                    newBoard[i][j] = liveNeighbors == 2 || liveNeighbors == 3 ? true : false;
	                } else {
	                    // Rule 4
	                    newBoard[i][j] = liveNeighbors == 3;
	                }
	            }
	        }

	        return newBoard;
	    }
	    

	    
	    public static int countLiveNeighbors(boolean[][] board, int row, int col) {
	        int liveNeighbors = 0;
	        int rows = board.length;
	        int cols = board[0].length;
	        int[][] neighbors = {
	                {-1, -1}, {-1, 0}, {-1, 1},
	                {0, -1},           {0, 1},
	                {1, -1}, {1, 0}, {1, 1}
	        };
	        for (int[] neighbor : neighbors) {
	            int r = row + neighbor[0];
	            int c = col + neighbor[1];
	            if (r >= 0 && r < rows && c >= 0 && c < cols && board[r][c]) {
	                liveNeighbors++;
	            }
	        }
	        return liveNeighbors;
	    }

	    
	    
	    // Formatted I/O function
	    public static void printBoard(boolean[][] board) {
	        for (boolean[] row : board) {
	            for (boolean cell : row) {
	                System.out.print(cell ? '*' : '-');
	            }
	            System.out.println();
	        }
	    }

	    
	    
	    public static void main(String[] args) {
	        boolean[][] initialBoard = {
	                {false, false, false, false},
	                {false, true, true, false},
	                {false, true, true, false},
	                {false, false, false, false}
	        };
	        System.out.println("Generation 1:");
	        printBoard(initialBoard);
	        for (int generation = 2; generation <= 5; generation++) {
	            initialBoard = getNextGeneration(initialBoard);
	            System.out.println("Generation " + generation + ":");
	            printBoard(initialBoard);
	        }
	    }	
}