class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        res(n, ans, new ArrayList<>(), 0);
        return ans;
    }

    public void res(int n, ArrayList<ArrayList<Integer>> ans,
                    ArrayList<Integer> ls, int row) {

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

            if (Math.abs(row - prevRow) ==
                Math.abs(col - prevCol)) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> buildBoard(ArrayList<Integer> ls, int n) {
        ArrayList<Integer> board = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            board.add(ls.get(row) + 1);
        }

        return board;
    }
}