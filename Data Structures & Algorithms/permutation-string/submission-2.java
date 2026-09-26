class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        String key = getKey(s1);
        int[] freq = new int[26];
        int L=0;
        for(int i=0;i<s2.length();i++){
            while(i-L+1<s1.length()){
                freq[s2.charAt(i++)-'a']++;
                continue;
            }
            freq[s2.charAt(i)-'a']++;
            if(Arrays.toString(freq).equals(key))
                return true;
            freq[s2.charAt(L++)-'a']--;
        }
        return false;
    }
    private String getKey(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)-'a']++;    
        return Arrays.toString(freq);
    }
    
}
