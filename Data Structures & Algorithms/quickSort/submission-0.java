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
        sort(pairs,0,pairs.size());
        return pairs;
    }
    public void sort(List<Pair> pairs,int start,int end){
        if(end-start<=1)
            return;
        int left = start,pivot = end-1;
        for(int i=start;i<end;i++)
            if(pairs.get(i).key<pairs.get(pivot).key){
                Pair temp = pairs.get(i);
                pairs.set(i,pairs.get(left));
                pairs.set(left,temp);
                left++;
            }
        Pair temp = pairs.get(left);
        pairs.set(left,pairs.get(pivot));
        pairs.set(pivot,temp);
        sort(pairs,start,left);
        sort(pairs,left+1,end);
    }
}
