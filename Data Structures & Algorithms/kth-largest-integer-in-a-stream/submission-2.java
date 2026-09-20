class KthLargest {
    PriorityQueue<Integer> pq;
    int size;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue(k);
        size = k;
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>size)
                pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>size){
            pq.poll();
        }
        return pq.peek();
    }
}
