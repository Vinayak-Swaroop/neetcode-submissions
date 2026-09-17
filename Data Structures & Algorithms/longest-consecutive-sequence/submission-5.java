class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> lookup = new HashSet();
        for(int num:nums)
          lookup.add(num);
        int maxLength=0;
        for(int num:nums){
          if(lookup.contains(num-1))
            continue;
          int length=0;
          while(lookup.contains(num+length))
            length++;
          maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }
}
