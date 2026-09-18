class MovingAverage {
    Queue<Integer> q;
    int movingSum;
    int size;
    public MovingAverage(int size) {
        q=new ArrayDeque(size);
        movingSum=0;
        this.size=size;
    }
    
    public double next(int val) {
        if(q.size()==size){
            movingSum-=q.poll();
            movingSum+=val;
            q.add(val);
            return (movingSum/(double)size);
        }
        q.add(val);
        movingSum+=val;
        return movingSum/(double)q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
