package GameLife.HW20GameLife;

import java.util.Arrays;
import java.util.Scanner;

public class Action {
	private History history = new History();
	private Exam checkBoard = new Exam();

	private int[][] board = new Board().getBoard();

	public void action() {
		do {
			printableBoard(board);
			
			history.recordingBoardHistory(board);
			
			checkBoard.CHECKTEST(history.getCurrentBoard(), history.getPreviosBoard(), history.getLastBoard());
			
			int[][] nextBoard = new Iteration().nextIteration(board);
			
			board = Arrays.copyOf(nextBoard, nextBoard.length);

			new Scanner(System.in).nextLine();

		} while (checkBoard.getCheck());

	}
	
	public void printableBoard(int[][] board) {
		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
