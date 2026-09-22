class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<prefix.length;i++)
            prefix[i] = prefix[i-1]*nums[i];
        int[] postfix = new int[nums.length];
        postfix[nums.length-1] = nums[nums.length-1];
        for(int i=postfix.length-2;i>=0;i--)
            postfix[i]=nums[i]*postfix[i+1];
        int[] result = new int[nums.length];
        for(int i=0;i<result.length;i++){
            result[i]=(i==0?1:prefix[i-1])*(i==result.length-1?1:postfix[i+1]);
        }
        return result;
    }
}  
