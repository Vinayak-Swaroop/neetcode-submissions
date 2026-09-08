class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSelect(nums, 0, nums.length, nums.length - k);
        return nums[nums.length - k];
    }
    private void quickSelect(int[] nums, int start, int end, int k) {
        if (end - start <= 1)
            return;
        int pivot = end - 1, left = start;
        for (int i = start; i < pivot; i++) {
            if (nums[i] < nums[pivot]) {
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }
        int temp = nums[pivot];
        nums[pivot] = nums[left];
        nums[left] = temp;

        if (k < left)
            quickSelect(nums, start, left, k);
        else if (k > left)
            quickSelect(nums, left+1, end, k);
        else
            return;
    }
}
