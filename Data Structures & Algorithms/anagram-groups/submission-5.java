class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups = new HashMap();
        for(String string:strs){
            String key = getKey(string);
            groups.putIfAbsent(key,new ArrayList());
            groups.get(key).add(string);
        }
        return new ArrayList(groups.values());
    }
    private String getKey(String string){
        int[] freq = new int[26];
        for(int i=0;i<string.length();i++){
            freq[string.charAt(i)-'a']++;
        }
        return Arrays.toString(freq);
    }
}
