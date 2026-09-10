class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] frequencyMap=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(frequencyMap[nums[i]])
                return nums[i];
            frequencyMap[nums[i]]=true;
        }
        return -1;
    }
}
