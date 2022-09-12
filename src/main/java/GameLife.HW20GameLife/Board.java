package GameLife.HW20GameLife;

public class Board {
	private int x = 5 + 2;
	private int y = 10 + 2;

	public int getValueX() {
		return x;
	}

	public int getValueY() {
		return y;
	}

	public int[][] getBoard() {
		return generationValue();
	}

	private int[][] generationValue() {
		int[][] board = new int[getValueX()][getValueY()];

		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length - 1; j++) {
				board[i][j] = (int) (Math.random() * 2);
			}
		}
		return board;
	}
}
