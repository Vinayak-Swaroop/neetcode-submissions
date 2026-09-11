class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0,maxSum = nums[0];
        for(int i=0;i<nums.length;i++){
            currSum = Math.max(currSum,0);
            currSum+=nums[i];
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
