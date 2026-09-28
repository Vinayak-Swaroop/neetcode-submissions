class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int zero_count =0, one_count = 0, max = Integer.MIN_VALUE;
        int l = 0, r = 0;
        for(r=0;r<nums.length;r++){
            if(nums[r]==0)
                zero_count++;
            else
                one_count++;
            if(zero_count==1)
                max = Math.max(max,one_count+1);
            else
                max = Math.max(max,one_count);
            while(zero_count>1 && nums[r]==0){
                if(nums[l]==0)
                    zero_count--;
                else
                    one_count--;
                l++;
            }
        }
        return max;

    }
}
