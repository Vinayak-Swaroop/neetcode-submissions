class MovingAverage {
    int size;
    int movingSum;
    Queue<Integer> q;
    public MovingAverage(int size) {
        this.size=size;
        q=new ArrayDeque<Integer>();
        movingSum=0;
    }
    
    public double next(int val) {
        q.add(val);
        movingSum+=val;
        if(q.size()>size){
            movingSum-=q.poll();
        }
        return movingSum/(double)(q.size());
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
