class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for (int k = 0; k < nums.length; k++) {
            while (k > 0 && k < nums.length && nums[k - 1] == nums[k]) k++;
            int i = k + 1, j = nums.length - 1;
            while (j > i) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum == 0) {
                    List<Integer> list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    i++;
                    while (i < j && nums[i - 1] == nums[i]) i++;
                }
                if (sum < 0) {
                    i++;
                } else
                    j--;
            }
        }
        return result;
    }
}
