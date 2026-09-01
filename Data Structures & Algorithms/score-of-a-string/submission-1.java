class Solution {
    public int scoreOfString(String s) {
        if(s.length()<=1)
            return 0;
        int i=0,j=1,sum=0;
        while(j<s.length()){
            int diff = Math.abs(s.charAt(j)-s.charAt(i));
            sum+=diff;
            i++;j++;
        }
        return sum;
    }
}