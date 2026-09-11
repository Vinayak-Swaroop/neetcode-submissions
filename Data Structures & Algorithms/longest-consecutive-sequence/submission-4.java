class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int num:nums)
          set.add(num);
        int maxLength=0;
        for(int num:nums){
          if(set.contains(num-1))
            continue;
          int currentLength=0;
          while(set.contains(num+currentLength))
            currentLength++;
          maxLength=maxLength<currentLength?currentLength:maxLength;
        }
        return maxLength;
    }
}
