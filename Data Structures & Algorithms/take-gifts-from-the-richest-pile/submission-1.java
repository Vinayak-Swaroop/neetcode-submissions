class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++)
            pq.add(gifts[i]);
        while(k>0){
            int max = pq.poll();
            max = (int) Math.floor(Math.sqrt(max));
            pq.add(max);
            k--;
        }
        int n=pq.size();
        int totalGifts = 0;
        for(int i=0;i<n;i++){
            totalGifts+=pq.poll();
        }
        return totalGifts;
    }
}