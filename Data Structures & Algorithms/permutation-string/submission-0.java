class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int[] s1FrequencyArray= new int[26];
        for(int i=0;i<s1.length();i++)
            s1FrequencyArray[s1.charAt(i)-'a']++;
        String s1Key = Arrays.toString(s1FrequencyArray);
        String window="";
        int[] frequencyArray = new int[26];
        for(int i=0;i<s2.length();){
            while(window.length()<s1.length() && i<s2.length()){
                char c = s2.charAt(i++);
                window+=c;
                frequencyArray[c-'a']++;
            }
            String windowKey = Arrays.toString(frequencyArray);
            if(windowKey.equals(s1Key))
                return true;
            frequencyArray[window.charAt(0)-'a']--;
            window=window.substring(1);
        }
        return false;
    }
}
