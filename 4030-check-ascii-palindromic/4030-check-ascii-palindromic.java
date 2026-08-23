class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            String bits = String.format("%8s", Integer.toBinaryString(ch))
                    .replace(' ', '0');
            str.append(bits);
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}