class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L=0,R=0;
        Set<Character> window = new HashSet();
        int maxLength = 0;
        for(;R<s.length();R++){
            while(window.contains(s.charAt(R))){
                if(window.contains(s.charAt(L)))
                    window.remove(s.charAt(L));
                L++;
            }
            window.add(s.charAt(R));
            maxLength = Math.max(maxLength,R-L+1);
        }
        return maxLength;
    }
}
