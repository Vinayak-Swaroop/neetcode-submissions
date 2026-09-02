class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(reverse);
        if(reverse.equalsIgnoreCase(s))
            return true;
        return false;
    }
}
