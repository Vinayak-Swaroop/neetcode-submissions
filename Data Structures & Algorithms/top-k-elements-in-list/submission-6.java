class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int num: nums){
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((a,b)->b.freq-a.freq);
        map.forEach((num,freq)->{
            pq.add(new Pair(num,freq));
        });
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.poll().val;
        }
        return result;
    }
}
class Pair
{
    int val;
    int freq;
    Pair(int val,int freq){
        this.val=val;
        this.freq=freq;
    }
}
