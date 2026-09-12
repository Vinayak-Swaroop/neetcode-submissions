class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (j > i) {
            if (!isAlphaNum(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isAlphaNum(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toUpperCase(s.charAt(j)) != Character.toUpperCase(s.charAt(i)))
                return false;
            i++;j--;
        }
        return true;
    }
    private boolean isAlphaNum(Character c) {
        return (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'));
    }
}
