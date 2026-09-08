// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        quickSort(pairs, 0, pairs.size());
        return pairs;
    }
    private void quickSort(List<Pair> pairs, int start, int end) {
        if (end - start <= 1)
            return;
        int left = start, pivot = end - 1;
        for (int i = start; i < pivot; i++)
            if (pairs.get(i).key < pairs.get(pivot).key) {
                Pair temp = pairs.get(i);
                pairs.set(i, pairs.get(left));
                pairs.set(left, temp);
                left++;
            }
        Pair temp = pairs.get(pivot);
        pairs.set(pivot, pairs.get(left));
        pairs.set(left, temp);
        quickSort(pairs,start,left);
        quickSort(pairs,left+1,end);
    }
}
