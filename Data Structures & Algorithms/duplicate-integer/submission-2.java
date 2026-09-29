class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> window = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(window.contains(nums[i]))
                return true;
            window.add(nums[i]);
        }
        return false;
    }
}