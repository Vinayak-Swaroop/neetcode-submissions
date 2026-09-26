class Solution {
    public int characterReplacement(String s, int k) {
        int[] characters = new int[26];
        int max =0;
        int L=0;
        for(int R=0;R<s.length();R++){
            characters[s.charAt(R)-'A']++;
            if(R-L+1-maxFrequency(characters)<=k){
                max=Math.max(max,R-L+1);
                continue;
            }
            while(R-L+1-maxFrequency(characters)>k){
                characters[s.charAt(L)-'A']--;
                L++;
            }
        }
        return max;
    }
    private int maxFrequency(int[] freq){
        int max = 0;
        for(int i=0;i<freq.length;i++)
            max = Math.max(max,freq[i]);
        return max;
    }
}
