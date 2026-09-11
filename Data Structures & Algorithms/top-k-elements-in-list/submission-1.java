class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap();
        for(int num:nums){
            frequencyMap.putIfAbsent(num,0);
            frequencyMap.put(num,frequencyMap.get(num)+1);
        }
        PriorityQueue<Pair> heap = new PriorityQueue<Pair>((p1,p2)->p2.frequency-p1.frequency);
        frequencyMap.forEach((val,frequency)->{
            heap.add(new Pair(val,frequency));
        });
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = heap.poll().val;
        }
        return result;
    }
}
class Pair
{
    int val;
    int frequency;
    Pair(int val,int frequency){
        this.val=val;
        this.frequency=frequency;
    }
}
