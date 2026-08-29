class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0, i = 0, j = heights.length - 1;
        while (j > i) {
            int area = (j - i) * Math.min(heights[i], heights[j]);
            maxArea = Math.max(area, maxArea);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
