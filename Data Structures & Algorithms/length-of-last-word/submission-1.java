class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==1)
            return 1;
        int i=s.length()-1;
        int length =0 ;
        while(i>=0 && s.charAt(i)==' ')
            i--;
        if(i<0)
            return 0;
        while(s.charAt(i)!=' '){
            i--;
            length++;
        }
        return length;
    }
}