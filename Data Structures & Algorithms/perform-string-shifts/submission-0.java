class Solution {
    public String stringShift(String s, int[][] shift) {
        int actualShift = 0;
        for (int i = 0; i < shift.length; i++) {
            int shiftWithDirection = shift[i][0] == 0 ? shift[i][1] * -1 : shift[i][1];
            actualShift += shiftWithDirection;
        }
        if (actualShift == 0)
            return s;
        char[] charArray = s.toCharArray();
        if (actualShift < 0)
            return leftShift(charArray, Math.abs(actualShift));
        else
            return rightShift(charArray, actualShift);
    }
    public String leftShift(char[] s, int times) {
        for (int count = 0; count < times; count++) {
            char temp = s[0];
            for (int i = 0; i < s.length - 1; i++) s[i] = s[i + 1];
            s[s.length - 1] = temp;
        }
        return new String(s);
    }
    public String rightShift(char[] s, int times) {
        for (int count = 0; count < times; count++) {
            char temp = s[s.length - 1];
            for (int i = s.length - 1; i > 0; i--) s[i] = s[i - 1];
            s[0] = temp;
        }
        return new String(s);
    }
}
