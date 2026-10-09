class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        res(s, ans, new ArrayList<>(), 0);
        return ans;
    }

    public void res(String s, List<List<String>> ans, ArrayList<String> ls, int start) {
        if (start == s.length()) {
            ans.add(new ArrayList(ls));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (!Palind(s, start, i))
                continue;

            ls.add(s.substring(start, i + 1));
            res(s, ans, ls, i + 1);
            ls.remove(ls.size() - 1);
        }
    }

    public boolean Palind(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;

            low++;
            high--;
        }
        return true;
    }

}