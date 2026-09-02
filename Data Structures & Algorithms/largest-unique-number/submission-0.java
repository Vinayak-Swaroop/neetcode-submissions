class Solution {
    public int largestUniqueNumber(int[] nums) {
       Map<Integer,Integer> frequency= new HashMap<>();
       HashSet<Integer> discarded = new HashSet();
       for(int i=0;i<nums.length;i++){
        if(frequency.containsKey(nums[i])){
            frequency.put(nums[i],frequency.get(nums[i]+1));
            discarded.add(nums[i]);
        }
        else
            frequency.put(nums[i],1);
       }
       int max = -1;
       for(int i=0;i<nums.length;i++){
            if(discarded.contains(nums[i]))
                continue;
            if(nums[i]>max)
                max=nums[i];
       }
       return max;       
    }
}
