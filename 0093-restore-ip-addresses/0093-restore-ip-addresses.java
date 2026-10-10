class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12)
            return ans;
        res(s, ans, new ArrayList<>(), 0);
        return ans;
    }

    public void res(String s, List<String> ans, ArrayList<String> ls, int start) {
        if (ls.size() == 4) {
            if (start == s.length()) {
                ans.add(String.join(".", ls));
            }
            return;
        }

        for(int i=start ; i<s.length() && i<start+3 ; i++){
            String sb = s.substring(start , i+1);
            if(sb.length()>1 && sb.charAt(0)=='0') break;

            if(Integer.parseInt(sb) > 255) break;

            ls.add(sb);
            res(s , ans , ls , i+1);
            ls.remove(ls.size()-1);
        }
    }
}