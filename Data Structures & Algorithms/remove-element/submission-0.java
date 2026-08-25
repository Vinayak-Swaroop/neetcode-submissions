class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1,k=0;
        while(j>=i){
            if(nums[j]==val){
                j--;
                k++;
                continue;
            }
            if(nums[i] == val){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
                k++;
                continue;
            }
            i++;
        }
        k=nums.length-k;
        return k;
    }
}