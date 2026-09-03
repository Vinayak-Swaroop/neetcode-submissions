class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character,Integer> index = new HashMap<>();
        for(int i=0;i<keyboard.length();i++){
            index.put(keyboard.charAt(i),i);
        }
        int currentIndex=0;
        int sum=0;
        for(int i=0;i<word.length();i++){
            int nextIndex = index.get(word.charAt(i));
            int distance = Math.abs(currentIndex-nextIndex);
            sum+=distance;
            currentIndex=nextIndex;
        }
        return sum;
    }
}
