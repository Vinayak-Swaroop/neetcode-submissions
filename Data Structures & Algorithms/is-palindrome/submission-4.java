class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (j > i) {
            char right = s.charAt(j);
            while (i < j
                && (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))))
                i++;
            while (j > i && (!Character.isDigit(s.charAt(j)) && !Character.isLetter(s.charAt(j))))
                j--;
           
                if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j)))
                    return false;
                else {
                    i++;
                    j--;
                }
        }
        return true;
    }
}
