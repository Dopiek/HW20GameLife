package GameLife.HW20GameLife;

public class Iteration {
	
	public int[][] nextIteration(int[][] currentBoard) {
		int[][] nextBoard = new int[new Board().getValueX()][new Board().getValueY()];

		for (int i = 1; i < currentBoard.length - 1; i++) {
			for (int j = 1; j < currentBoard[i].length - 1; j++) {

				int value = 
						currentBoard[i - 1][j - 1] + 
						currentBoard[i - 1][j] + 
						currentBoard[i - 1][j + 1] + 
						currentBoard[i][j - 1] + 
						currentBoard[i][j + 1] + 
						currentBoard[i + 1][j - 1] + 
						currentBoard[i + 1][j] + 
						currentBoard[i + 1][j + 1];

				switch (currentBoard[i][j]) {
				case 1: {
					if (value > 3 || value < 2)
						nextBoard[i][j] = 0;
					else
						nextBoard[i][j] = 1;
					break;
				}
				case 0: {
					if (value == 3)
						nextBoard[i][j] = 1;
					else
						nextBoard[i][j] = 0;
					break;
				}
				}
			}
		}
		return nextBoard;
	}
}
