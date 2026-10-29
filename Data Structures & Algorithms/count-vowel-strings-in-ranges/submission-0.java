class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        Set<Integer> indices = new HashSet();
        for(int i=0;i<words.length;i++){
            String string = words[i];
            if(vowels.contains(string.charAt(0)) && vowels.contains(string.charAt(string.length()-1)))
                indices.add(i);
        }
        int[] resultArray = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int[] query=queries[i];
            int result = 0;
            for(int index:indices)
                if(index>=query[0] && index<=query[1])
                    result++;
            resultArray[i]=result;
        }
        return resultArray;
    }
}