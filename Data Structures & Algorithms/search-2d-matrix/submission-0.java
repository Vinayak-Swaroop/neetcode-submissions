class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] searchArray = getArrayToSearch(matrix,target);
        if(searchArray==null)
            return false;
        int index = searchElement(searchArray,target);
        if(index==-1)
            return false;
        return true;
    }
    private int[] getArrayToSearch(int[][] matrix,int target){
        int low = 0, high = matrix.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int n = matrix[mid].length-1;
            if(target<matrix[mid][0])
                high = mid-1;
            else if(target>=matrix[mid][0] && target<=matrix[mid][n])
                return matrix[mid];
            else
                low = mid+1;
        }
        return null;
    }
    private int searchElement(int[] nums, int target){
        int low =0,high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target<nums[mid])
                high = mid-1;
            else if(target>nums[mid])
                low = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
