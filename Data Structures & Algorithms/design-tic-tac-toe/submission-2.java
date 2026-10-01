class TicTacToe {
    int[][] square;
    int n;
    public TicTacToe(int n) {
        square = new int[n][n];
        this.n = n;
    }

    public int move(int row, int col, int player) {
        square[row][col] = player;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (square[row][i] != player) {
                flag = false;
                break;
            }
        }
        if (flag)
            return player;
        flag = true;
        for (int i = 0; i < n; i++) {
            if (square[i][col] != player) {
                flag = false;
                break;
            }
        }
        if (flag)
            return player;
        if (row == col) {
            flag = true;
            for (int i = 0; i < n; i++) {
                if (square[i][i] != player) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return player;
        }
        if(row+col==n-1){
            flag = true;
            for (int i = 0; i < n; i++) {
                if (square[i][n-i-1] != player) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return player;
        }
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
