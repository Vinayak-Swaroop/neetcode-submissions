class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int maxArea = 0;
        while(j>i){
            int area = Math.min(heights[i],heights[j])*(j-i);
            if(area>maxArea)
                maxArea = area;
            if(heights[i]<heights[j])
                i++;
            else
                j--;
        }
    return maxArea;
    }
}
