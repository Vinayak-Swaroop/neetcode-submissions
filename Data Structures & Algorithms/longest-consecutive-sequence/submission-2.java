class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        int min=nums[0],max = nums[0];
        Set<Integer> lookup = new HashSet<>();
        for(int num:nums){
            lookup.add(num);
            if(num<min)
                min = num;
            if(max<num)
                max = num;
        }
        int currentLength=0;
        int maxLength=0;
        for(int num:lookup){
            if(!lookup.contains(num-1)){
                int length=1;
                while(lookup.contains(num+length)) length++;
                maxLength = Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}
