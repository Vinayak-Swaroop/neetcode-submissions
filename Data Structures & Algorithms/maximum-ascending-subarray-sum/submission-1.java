class Solution {
    public int maxAscendingSum(int[] nums) {
        int currentSum=0;
        int maxSum = 0;
        int L=0,R=0;
        for(R=0;R<nums.length;R++){
            if(R>0 && nums[R]<=nums[R-1]){
                maxSum = Math.max(maxSum,currentSum);
                currentSum = 0;
                L=R;
            }
            if(currentSum<0){
                maxSum = Math.max(currentSum,maxSum);
                currentSum=0;
                L=R;
                continue;
            }
            currentSum+=nums[R];
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}