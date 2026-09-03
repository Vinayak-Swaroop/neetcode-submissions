class Solution {
    public boolean validPalindrome(String s) {
        boolean oneDeleted = false;
        return isPalindrome(s,oneDeleted);
    }
    public boolean isPalindrome(String s,boolean oneDeleted){
        if(s.length()<=1)
            return true;
        if(s.charAt(0)==s.charAt(s.length()-1))
            return isPalindrome(s.substring(1,s.length()-1),oneDeleted);
        if(oneDeleted){
            return false;
        }
        if(s.charAt(1)==s.charAt(s.length()-1) && s.charAt(0)==s.charAt(s.length()-2))
        return isPalindrome(s.substring(1,s.length()),true) || isPalindrome(s.substring(0,s.length()-1),true);
        if(s.charAt(1)==s.charAt(s.length()-1))
            return isPalindrome(s.substring(1,s.length()),true);
        if(s.charAt(0)==s.charAt(s.length()-2))
            return isPalindrome(s.substring(0,s.length()-1),true);    
        return false;
    }
}