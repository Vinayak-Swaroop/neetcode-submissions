// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        mergeSort(pairs, 0, pairs.size());
        return pairs;
    }
    private void mergeSort(List<Pair> pairs, int start, int end) {
        if (end - start <= 1)
            return;
        int mid = (start + end) / 2;
        mergeSort(pairs, start, mid);
        mergeSort(pairs, mid, end);
        merge(pairs, start, mid, end);
    }
    private void merge(List<Pair> pairs, int start, int mid, int end) {
        List<Pair> left = new ArrayList(pairs.subList(start, mid));
        List<Pair> right  = new ArrayList(pairs.subList(mid, end));
        int i = 0, j = 0, k = start;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).key <= right.get(j).key){
                pairs.set(k, left.get(i));
                i++;k++;
            }
            else{
                pairs.set(k, right.get(j));
                k++;j++;
            }
        }
        while (i < left.size()){
            pairs.set(k, left.get(i));
            i++;k++;
        }

        while (j < right.size()){
            pairs.set(k, right.get(j));
            k++;j++;
        }
    }
}
