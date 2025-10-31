class Solution {
    public int lengthOfLastWord(String s) {
        String[] sw=s.trim().split(" ");
        return sw[sw.length-1].length();
    }
}