class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset=new ArrayList();
        List<List<Integer>> result=new ArrayList();
        dfsBT(nums,0,subset,result);
        return result;
    }
    private void dfsBT(int[] nums,int i,List<Integer> subset,List<List<Integer>> result){
        if(i>=nums.length){
            result.add(new ArrayList(subset));
            return;
        }
        subset.add(nums[i]);
        dfsBT(nums,i+1,subset,result);
        subset.remove(subset.size()-1);
        dfsBT(nums,i+1,subset,result);
    }
}
