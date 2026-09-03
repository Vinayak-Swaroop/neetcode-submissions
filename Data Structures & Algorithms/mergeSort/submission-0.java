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
        sort(pairs,0,pairs.size());
        return pairs;
    }
    private void sort(List<Pair> pairs,int start,int end){
        if(end-start<=1)
            return;
        int mid=(start+end)/2;
        sort(pairs,start,mid);
        sort(pairs,mid,end);
        merge(pairs,start,mid,end);
    }
    private void merge(List<Pair> pairs,int start,int mid,int end){
        List<Pair> left=new ArrayList(),right=new ArrayList();
        for(int i=start;i<mid;i++)
            left.add(pairs.get(i));
        for(int i=mid;i<end;i++)
            right.add(pairs.get(i));
        int i=0,j=0,k=start;
        while(i<left.size() && j<right.size()){
            if(left.get(i).key<=right.get(j).key)
                pairs.set(k++,left.get(i++));
            else
                pairs.set(k++,right.get(j++));
        }
        while(i<left.size())
            pairs.set(k++,left.get(i++));
        while(j<right.size())
            pairs.set(k++,right.get(j++));
    }
    private void displayPairs(List<Pair> pairs){
        pairs.forEach(pair->System.out.print(pair.key+","));
        System.out.println();
    }
}
