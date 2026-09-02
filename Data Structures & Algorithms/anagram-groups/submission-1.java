class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result = new HashMap<>();
        for(String string:strs){
            int[] key = new int[26];
            for(int i=0;i<string.length();i++){
                key[string.charAt(i)-'a']++;
            }
            String keyString = Arrays.toString(key);
            result.putIfAbsent(keyString,new ArrayList());
            result.get(keyString).add(string);
        }
        return new ArrayList(result.values());
    }
}
