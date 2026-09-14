class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1,maxArea=0;
        while(j>i){
            int area = (j-i)*Math.min(heights[i],heights[j]);
            maxArea = Math.max(area,maxArea);
            if(heights[i]<heights[j])
                i++;
            else
                j--;
        }
        return maxArea;
    }
}
