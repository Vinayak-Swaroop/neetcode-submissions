class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (high > low) {
            mid = (low + high) / 2;
            if (nums[high] < nums[mid])
                low = mid+1;
            else
                high = mid;
        }
        return nums[low];
    }
}
