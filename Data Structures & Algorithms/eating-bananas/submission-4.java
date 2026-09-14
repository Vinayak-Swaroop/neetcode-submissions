class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int num:piles) max=Math.max(num,max);
        int low = 1, high = max,mid=0;
        while(low<=high){
            mid = low + (high-low)/2;
            long timeTaken=0;
            for(int pile:piles){
                timeTaken += Math.ceil((pile)/((double)mid));
            }
            if(timeTaken<=h)
                high=mid-1;
            else if(timeTaken>h)
                low=mid+1;
        }
        return low;
    }
}
