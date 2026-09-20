class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSelect(nums,0,nums.length,nums.length-k);
        return nums[nums.length-k];
    }
    private void quickSelect(int[] nums,int start,int end,int k){
        if(end-start<=1)
            return;
        int left=start,pivot = end-1;
        for(int i=start;i<pivot;i++){
            if(nums[i]<nums[pivot]){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }
        int temp = nums[left];
        nums[left] = nums[pivot];
        nums[pivot] = temp;
        pivot = left;
        if(k==pivot)
            return;
        if(k<pivot)
            quickSelect(nums,start,pivot,k);
        else
            quickSelect(nums,pivot+1,end,k);
    }
}
