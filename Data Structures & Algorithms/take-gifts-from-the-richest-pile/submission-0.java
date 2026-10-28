class Solution {
    public long pickGifts(int[] gifts, int k) {
        while(k>0){
            int maxIndex = 0;
            for(int i=0;i<gifts.length;i++){
                if(gifts[maxIndex]<gifts[i])
                    maxIndex = i;
            }
            gifts[maxIndex] = (int) Math.floor(Math.sqrt(gifts[maxIndex]));
            k--;
        }
        int totalGifts = 0;
        for(int i=0;i<gifts.length;i++)
            totalGifts+=gifts[i];
        return totalGifts;
    }
}