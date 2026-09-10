class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for (int k = 0; k < nums.length; k++) {
            if (k > 0 && nums[k] == nums[k - 1])
                continue;
            int low = k + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[k] + nums[low] + nums[high];
                if (sum < 0)
                    low++;
                else if (sum > 0)
                    high--;
                else {
                    List<Integer> list = new ArrayList();
                    list.add(nums[k]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    low++;
                    while (low < high && nums[low] == nums[low - 1]) low++;
                }
            }
        }
        return result;
    }
}
