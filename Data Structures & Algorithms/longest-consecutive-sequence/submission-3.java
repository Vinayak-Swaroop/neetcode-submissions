class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> lookup = new HashSet();
      for(int i=0;i<nums.length;i++)
        lookup.add(nums[i]);
      int maxLength=0;
      for(int num:lookup){
        if(!lookup.contains(num-1)){
            int length=1;
            while(lookup.contains(num+length))
                length++;
            maxLength=maxLength<length?length:maxLength;
        }
      }
      return maxLength;
    }
}
