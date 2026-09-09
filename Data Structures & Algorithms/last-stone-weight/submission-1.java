class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());
        for(int num:stones){
            heap.add(num);
        }
        while(heap.size()>1){
            int stone1=heap.poll();
            int stone2=heap.poll();
            if(stone1==stone2)
                continue;
            else
                heap.add(Math.abs(stone1-stone2));
        }
        return heap.size()==1?heap.poll():0;
    }
}
