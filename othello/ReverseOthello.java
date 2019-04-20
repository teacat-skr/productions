public class ReverseOthello {
    public static int[][] reverse (Othello othello, int[][] boardOthello) {
        int color = othello.getType();
        boardOthello[othello.getPlase()[0]][othello.getPlase()[1]] = color;
        if (othello.getCanReverse()[0] >0) {
            for (int i = 0; i < othello.getCanReverse()[0]; i++) {
                boardOthello[othello.getPlase()[0] - i -1][othello.getPlase()[1]] = color;
            }
        }
        if (othello.getCanReverse()[1] >0) {
            for (int i = 0; i < othello.getCanReverse()[1]; i++) {
                boardOthello[othello.getPlase()[0] - i - 1][othello.getPlase()[1] + i + 1] = color;
            }
        }
        if (othello.getCanReverse()[2] >0) {
            for (int i = 0; i < othello.getCanReverse()[2]; i++) {
                boardOthello[othello.getPlase()[0]][othello.getPlase()[1] + i + 1] = color;
            }
        }
        if (othello.getCanReverse()[3] >0) {
            for (int i = 0; i < othello.getCanReverse()[3]; i++) {
                boardOthello[othello.getPlase()[0] + i + 1][othello.getPlase()[1] + i + 1] = color;
            }
        }
        if (othello.getCanReverse()[4] >0) {
            for (int i = 0; i < othello.getCanReverse()[4]; i++) {
                boardOthello[othello.getPlase()[0] + i + 1][othello.getPlase()[1]] = color;
            }
        }
        if (othello.getCanReverse()[5] >0) {
            for (int i = 0; i < othello.getCanReverse()[5]; i++) {
                boardOthello[othello.getPlase()[0] + i + 1][othello.getPlase()[1] - i - 1] = color;
            }
        }
        if (othello.getCanReverse()[6] >0) {
            for (int i = 0; i < othello.getCanReverse()[6]; i++) {
                boardOthello[othello.getPlase()[0]][othello.getPlase()[1] - i - 1] = color;
            }
        }
        if (othello.getCanReverse()[7] >0) {
            for (int i = 0; i < othello.getCanReverse()[7]; i++) {
                boardOthello[othello.getPlase()[0] - i - 1][othello.getPlase()[1] - i - 1] = color;
            }
        }
        return boardOthello;
    }
} 