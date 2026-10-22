class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> result = new ArrayList();
        int max = heights[heights.length-1];
        result.add(heights.length-1);
        for(int i=heights.length-1;i>=0;i--)
            if(heights[i]>max){
                max = heights[i];
                result.add(i);
            }
        int[] resultArray = new int[result.size()];
        for(int i=0;i<result.size();i++)
            resultArray[result.size()-i-1] = result.get(i);
        return resultArray;
    }
}