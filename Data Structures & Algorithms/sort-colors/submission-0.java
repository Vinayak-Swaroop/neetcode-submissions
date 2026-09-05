class Solution {
    public void sortColors(int[] nums) {
        int[] colorCount = new int[3];
        for(int i=0;i<nums.length;i++)
            colorCount[nums[i]]++;
        int k=0;
        for(int i=0;i<colorCount.length;i++)
            for(int j=0;j<colorCount[i];j++)
                nums[k++]=i;

    }
}