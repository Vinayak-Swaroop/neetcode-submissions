class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String,List<String>> map = new HashMap();
        for(String string:strings){
            String key = getKey(string);
            map.putIfAbsent(key,new ArrayList());
            map.get(key).add(string);
        }
        return new ArrayList(map.values());
    }
    private String getKey(String s){
        char[] chars = s.toCharArray();
        StringBuilder hashKey = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            hashKey.append((char) ((chars[i] - chars[i - 1] + 26) % 26 + 'a'));
        }

        return hashKey.toString();
    }
}
