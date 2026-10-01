class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int L=0,R=0;
        for(;R<nums.length;R++)
            if(nums[R]>=0)
                break;
        L=R-1;
        while(L>=0 && nums[L]>=0)
            L--;
        int j=0;
        while(R<nums.length && L>=0){
            if(Math.abs(nums[R])<Math.abs(nums[L])){
                result[j++]=nums[R]*nums[R];
                R++;
            }
            else{
                result[j++] = nums[L]*nums[L];
                L--;
            }
        }
        while(R<nums.length)
            result[j++]=nums[R]*nums[R++];
        while(L>=0)
            result[j++]=nums[L]*nums[L--];
        return result;
    }
}