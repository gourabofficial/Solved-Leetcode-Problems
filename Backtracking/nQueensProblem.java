public class nQueensProblem {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }

        }

        nqueen(board, 0);
    }

    static void nqueen(char[][] board, int row) {
        int n = board.length;

        // base case
        if (n == row) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int j = 0; j < n; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1); // resursive callll
                board[row][j] = 'X';

            }
        }

    }

    static boolean isSafe(char[][] board, int row, int col) {

        int n = board.length;

        // check row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // check coloum
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') { // neds to change [i][col]
                return false;
            }
        }

        // check right top diagonal
        int i = row;
        int j = col;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;

            i--;
            j++;
        }

        // check the right buttom diagonal
        i = row;
        j = col;

        while (i < n && j < n) {
            if (board[i][j] == 'Q')
                return false;

            i++;
            j++;
        }

        // check the left buttom diagonal

        i = row;
        j = col;

        while (i < n && j >= 0) {
            if (board[i][j] == 'Q')
                return false;

            i++;
            j--;
        }

        // check the left top diaonal
        i = row;
        j = col;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;

            i--;
            j--;
        }

        return true;
    }
}
