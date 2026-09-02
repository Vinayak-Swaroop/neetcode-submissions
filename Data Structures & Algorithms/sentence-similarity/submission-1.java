class Solution {
    public boolean areSentencesSimilar(
        String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length)
            return false;
        Map<String, HashSet<String>> similarWords = new HashMap<>();
        similarPairs.forEach(pair -> {
            similarWords.putIfAbsent(pair.get(0), new HashSet<String>());
            similarWords.get(pair.get(0)).add(pair.get(1));
            similarWords.putIfAbsent(pair.get(1),new HashSet<String>());
            similarWords.get(pair.get(1)).add(pair.get(0));

        });
        for (int i = 0; i < sentence1.length; i++) {
            String word1 = sentence1[i];
            String word2 = sentence2[i];
            if (word1.equals(word2))
                continue;
            if (similarWords.containsKey(word1)) {
                if (similarWords.get(word1).contains(word2))
                    continue;
            }
            if (similarWords.containsKey(word2)) {
                if (similarWords.get(word2).contains(word1))
                    continue;
            }
            return false;
        }
        return true;
    }
}
