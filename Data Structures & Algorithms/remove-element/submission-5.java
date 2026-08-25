class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]==val){
                if(i==j || nums[j]==val){
                    j++;
                    continue;
                } else{
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    continue;
                }
            }
            i++;j++;
        }
        int count =0;
        for(int num:nums){
            if(num==val)
                break;
            count++;
        }
        return count;
    }
}