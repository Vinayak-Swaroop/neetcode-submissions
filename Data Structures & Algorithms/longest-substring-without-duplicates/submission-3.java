class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int L=0;
        int current=0;
        Set<Character> window = new HashSet();
        for(int R=0;R<s.length();R++){
            while(window.contains(s.charAt(R))){
                window.remove(s.charAt(L));
                current--;
                L++;
            }
            window.add(s.charAt(R));
            current++;
            max=Math.max(current,max);
        }
        return max;
    }
}
