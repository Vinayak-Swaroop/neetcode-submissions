class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int[] minValues = new int[arrays.size()];
        int[] maxValues = new int[arrays.size()];

        for(int i=0;i<arrays.size();i++){
            List<Integer> currentArray = arrays.get(i);
            int maxValue,minValue;
            maxValue = minValue = currentArray.get(0);
            for(int num:currentArray){
                minValue = Math.min(num,minValue);
                maxValue = Math.max(num,maxValue);
            }
            minValues[i]=minValue;
            maxValues[i]=maxValue;
        }
        int maxDifference = -1;
        for(int i=0;i<minValues.length;i++){
            for(int j=0;j<maxValues.length;j++){
                if(i==j)
                    continue;
                maxDifference=Math.max(maxDifference,Math.abs(minValues[i]-maxValues[j]));
            }
        }
        return maxDifference;
    }
}
