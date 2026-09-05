class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSelect(nums, 0, nums.length, nums.length - k);
        return nums[nums.length - k];
    }
    public void quickSelect(int[] nums, int start, int end, int k) {
        if (end - start <= 1)
            return;
        int left = start, pivot = end - 1;
        for (int i = start; i < pivot; i++)
            if (nums[i] <= nums[pivot]) {
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        int temp = nums[left];
        nums[left] = nums[pivot];
        nums[pivot] = temp;
        if (k == left)
            return;
        else if (k < left)
            quickSelect(nums, start, left, k);
        else
            quickSelect(nums, left + 1, end, k);
    }
}
