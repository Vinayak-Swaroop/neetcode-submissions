class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax=0,currMin=0,max=nums[0],min=nums[0],total=0;
        for(int num:nums){
            currMax=Math.max(currMax+num,num);
            currMin=Math.min(currMin+num,num);
            max=Math.max(max,currMax);
            min=Math.min(min,currMin);
            total+=num;
        }
        return max<0?max:Math.max(max,total-min);
    }
}