class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<List<Boolean>> board = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Boolean> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(false);
            }
            board.add(row);
        }
        
        solve(board, 0, result);
        return result;
    }

    private void solve(List<List<Boolean>> board, int row, List<List<String>> result) {
        if (row == board.size()) {
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < board.size(); col++) {
            if (isSafe(board, row, col)) {
                board.get(row).set(col, true);
                solve(board, row + 1, result);
                board.get(row).set(col, false);
            }
        }
    }

    private boolean isSafe(List<List<Boolean>> board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board.get(i).get(col)) {
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board.get(row - i).get(col - i)) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.size() - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board.get(row - i).get(col + i)) {
                return false;
            }
        }

        return true;
    }

    private List<String> constructBoard(List<List<Boolean>> board) {
        List<String> result = new ArrayList<>();
        for (List<Boolean> row : board) {
            StringBuilder sb = new StringBuilder();
            for (Boolean element : row) {
                if (element) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            result.add(sb.toString());
        }
        return result;
    }
    }
