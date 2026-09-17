class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> compliment = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(compliment.containsKey(nums[i]))
                return new int[]{compliment.get(nums[i]),i};
            compliment.put(target-nums[i],i);
        }
        return null;
    }
}
