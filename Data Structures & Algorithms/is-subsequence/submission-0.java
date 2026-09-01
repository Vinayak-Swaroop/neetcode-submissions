class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length())
            return false;
        int i = 0, j = 0;
        while (j < s.length() && i < t.length()) {
            if (s.charAt(j) == t.charAt(i)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return !(j < s.length());
    }
}