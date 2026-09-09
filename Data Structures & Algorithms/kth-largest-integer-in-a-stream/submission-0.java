class KthLargest {
    PriorityQueue<Integer> heap;
    int k;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue();
        this.k=k;
        for(int num:nums){
            heap.add(num);
            if(heap.size()>k)
                heap.poll();
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>k)
            heap.poll();
        return heap.peek();
    }
}
