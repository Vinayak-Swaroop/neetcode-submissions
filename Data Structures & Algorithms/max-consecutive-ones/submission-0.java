class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,current = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                current++;
            }else{
                if(max<current){
                    max = current;
                }
                current = 0;
            }
        }
        if(max<current) max = current;
    return max;
    }
}