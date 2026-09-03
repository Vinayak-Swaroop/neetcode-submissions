class Solution {
    public boolean validPalindrome(String s) {
        boolean oneDeleted = false;
        return isPallindrome(s,false);
    }
    public boolean isPallindrome(String s,boolean oneDeleted){
        int i=0,j=s.length()-1;
        while(j>i){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
                continue;
            }
            if(oneDeleted)
                return false;
            if(s.charAt(i+1)==s.charAt(j) || s.charAt(j-1)==s.charAt(i)){
                return isPallindrome(s.substring(i+1,j+1),true) || isPallindrome(s.substring(i,j),true);
            }
            if(s.charAt(i+1)==s.charAt(j)){
                return isPallindrome(s.substring(i+1,j+1),true);
            }
            if(s.charAt(j-1)==s.charAt(i)){
                return isPallindrome(s.substring(i,j),true);
            }
            return false;
        }
        return true;
    }
}