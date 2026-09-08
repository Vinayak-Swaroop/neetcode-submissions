class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = piles[0];
        for (int i = 0; i < piles.length; i++)
            if (piles[i] > high)
                high = piles[i];
        int low = 1, mid = (low + high) / 2;
        while (high > low) {
            int timeTaken = getTimeTaken(piles, mid);
            if (timeTaken > h)
                low = mid + 1;
            else
                high = mid;
            mid = (low + high) / 2;
        }
        return mid;
    }
    private int getTimeTaken(int[] piles, int hourlyRate) {
        int totalTime = 0;
        for (int pile : piles) {
            totalTime+= (pile+hourlyRate-1)/hourlyRate;
        }
        return totalTime;
    }
}
