class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    for (int temp = j + 1; temp < board.length; temp++) {
                        if (board[i][j] == board[i][temp]) return false;
                    }
                }
                if (board[j][i] != '.') {
                    for (int temp = j + 1; temp < board.length; temp++) {
                        if (board[j][i] == board[temp][i]) return false;
                    }
                }
            }
        }
        for (int boxRow = 0; boxRow < board.length; boxRow += 3) {
            for (int boxCol = 0; boxCol < board.length; boxCol += 3) {
                int tempArr[] = new int[10];
                for (int row = boxRow; row < boxRow + 3; row++) {
                    for (int col = boxCol; col < boxCol + 3; col++) {
                        if (board[row][col] == '.') {
                            continue;
                        }
                        int num = board[row][col] - '0';
                        if (tempArr[num] == 1) {
                            return false;
                        }
                        tempArr[num] = 1;
                    }
                }
            }
        }
        return true;
    }
}