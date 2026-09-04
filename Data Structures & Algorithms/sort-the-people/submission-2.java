class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=1;i<names.length;i++){
            int j=i-1;
            while(j>=0 && heights[j+1]>heights[j]){
                String temp = names[j+1];
                names[j+1] = names[j];
                names[j] = temp;
                int temp2 = heights[j+1];
                heights[j+1]=heights[j];
                heights[j]=temp2;
                j--;
            }
        }
        return names;
    }
}