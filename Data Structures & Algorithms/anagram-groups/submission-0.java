class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String string = strs[i];
            int[] key = new int[26];
            for(int j=0;j<string.length();j++){
                key[string.charAt(j)-'a']++;
            }
            String keyString = Arrays.toString(key);
            groups.putIfAbsent(keyString,new ArrayList());
            groups.get(keyString).add(string);
        }
        return new ArrayList<>(groups.values());
    }
}
