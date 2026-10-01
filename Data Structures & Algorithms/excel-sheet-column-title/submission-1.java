class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        int num = columnNumber;
        while (num > 0) {
            num--;
            result += (char) (65 + num % 26);
            num /= 26;
        }
        return new StringBuilder(result).reverse().toString();
    }
}