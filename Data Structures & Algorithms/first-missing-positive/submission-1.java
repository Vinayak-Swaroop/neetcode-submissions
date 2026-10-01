class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++)
            if(nums[i]<0)
                nums[i]=0;
        for(int i=0;i<nums.length;i++){
            int value = Math.abs(nums[i]);
            int index = value-1;
            if(index>=0 && index<nums.length){
                if(nums[index]>0)
                    nums[index]*=-1;
                else
                    nums[index]=-1*(nums.length+1);
            }
        }
        int i=1;
        for(i=1;i<nums.length+1;i++){
            if(nums[i-1]<0)
                continue;
            return i;
        }
        return i;
    }
}