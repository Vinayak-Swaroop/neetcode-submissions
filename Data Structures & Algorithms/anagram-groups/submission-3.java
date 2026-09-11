class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String string:strs){
            int[] frequencyMap = new int[36];
            for(int i=0;i<string.length();i++)
                frequencyMap[string.charAt(i)-'a']++;
            String key = Arrays.toString(frequencyMap);
            map.putIfAbsent(key,new ArrayList());
            map.get(key).add(string);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
