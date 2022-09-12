package GameLife.HW20GameLife;

import java.util.Arrays;

public class Exam {
	private boolean result = true;

	public boolean getCheck() {
		return result;
	}

	public void CHECKTEST(int[][] currentBoard, int[][] previosBoard, int[][] lastBoard) {
		boolean equalsBoards = Arrays.deepEquals(currentBoard, previosBoard);

		if (equalsBoards != true) {
			equalsBoards = Arrays.deepEquals(currentBoard, lastBoard);

			if (equalsBoards != true) {
				int dotCounter = 0;

				for (int i = 1; i < currentBoard.length - 1; i++) {
					for (int j = 1; j < currentBoard[i].length - 1; j++) {
						if (currentBoard[i][j] > 0)
							dotCounter++;
					}
				}

				if (dotCounter > 0) {
					result = true;
				} else {
					System.out.println("Игра окончена. \nНету живых клеток");
					result = false;
				}

			} else {
				System.out.println("Игра окончена. \nЦикличный расклад");
				result = false;
			}
		} else {
			System.out.println("Игра окончена. \nПредыдущий расклад идентичный текущему");
			result = false;
		}
	}
}
