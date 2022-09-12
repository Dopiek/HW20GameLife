package GameLife.HW20GameLife;

import java.util.Arrays;

public class History {
	private int x = new Board().getValueX();
	private int y = new Board().getValueY();
	
	private int[][] lastBoard = new int[x][y];
	private int[][] previosBoard = new int[x][y];
	private int[][] currentBoard = new int[x][y];

	public void setCurrentBoard(int[][] board) {
		this.currentBoard = board;
	}
	
	public int[][] getCurrentBoard() {
		return currentBoard;
	}
	
	public void setPreviosBoard(int[][] board) {
		this.previosBoard = board;
	}	

	public int[][] getPreviosBoard() {
		return previosBoard;
	}
	
	public void setLastBoard(int[][] board) {
		this.lastBoard = board;
	}
	
	public int[][] getLastBoard() {
		return lastBoard;
	}
	
	public void recordingBoardHistory(int[][] board) {
		setLastBoard(Arrays.copyOf(getPreviosBoard(), getPreviosBoard().length));
		setPreviosBoard(Arrays.copyOf(getCurrentBoard(), getCurrentBoard().length));
		setCurrentBoard(Arrays.copyOf(board, board.length));
	}
}
