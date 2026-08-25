class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> differences = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int difference = target-nums[i];
            if(differences.containsKey(difference)){
                return new int[]{differences.get(difference),i};
            }
            differences.put(nums[i],i);
        }
        return new int[2];
    }
}
