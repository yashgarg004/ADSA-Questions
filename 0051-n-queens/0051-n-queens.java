class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        res(n, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void res(int n, List<List<String>> ans,ArrayList<Integer> ls, int row) {
        if (ls.size() == n) {
            ans.add(buildBoard(ls, n));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!isSafe(ls, row, col)) continue;

            ls.add(col);              
            res(n, ans, ls, row + 1); 
            ls.remove(ls.size() - 1); 
        }
    }

    public boolean isSafe(ArrayList<Integer> ls, int row, int col) {
        for (int prevRow = 0; prevRow < ls.size(); prevRow++) {
            int prevCol = ls.get(prevRow);
            if (prevCol == col) {
                return false;
            }

            if (Math.abs(row - prevRow) == Math.abs(col - prevCol)) {
                return false;
            }
        }

        return true;
    }

    public List<String> buildBoard(ArrayList<Integer> ls, int n) {List<String> board = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            StringBuilder sb = new StringBuilder();

            for (int col = 0; col < n; col++) {
                if (ls.get(row) == col) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            board.add(sb.toString());
        }

        return board;
    }
}