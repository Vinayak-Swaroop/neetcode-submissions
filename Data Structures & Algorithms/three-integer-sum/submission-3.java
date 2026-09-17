class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for(int k=0;k<nums.length;k++){
            while(k>0 && k<nums.length && nums[k-1]==nums[k])
                k++;
            int low=k+1,high=nums.length-1;
            while(low<high){
                int sum = nums[low]+nums[high]+nums[k];
                if(sum==0){
                    List<Integer> list = new ArrayList();
                    list.add(nums[low]);list.add(nums[k]);list.add(nums[high]);
                    result.add(list);
                    low++;
                    while(low<high && nums[low]==nums[low-1])
                        low++;
                }
                else if(sum<0){
                    low++;
                }else
                    high--;
            }
        }
        return result;
    }
}
