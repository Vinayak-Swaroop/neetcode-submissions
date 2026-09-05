class Solution {
    public boolean canPermutePalindrome(String s) {
        char[] frequency = new char[26];
        for(int i=0;i<s.length();i++)
            frequency[s.charAt(i)-'a']++;
        boolean oneOdd = false;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]%2==0)
                continue;
            if(oneOdd)
                return false;
            else
                oneOdd = true;
        }
        return true;
    }
}
