class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int total = 0, length = nums.length+1;
        int L=0;
        for(int R=0;R<nums.length;R++){
            total+=nums[R];
            while(target<=total){
                total-=nums[L];
                length=Math.min(length,R-L+1);
                L+=1;
            }
        }
        return (length==nums.length+1)?0:length;
    }
}