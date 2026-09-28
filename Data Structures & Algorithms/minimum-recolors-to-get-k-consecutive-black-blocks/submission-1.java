class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int[] BW = new int[2];
        int L = 0;
        for (int R = 0; R < blocks.length(); R++) {
            while (R - L < k - 1) {
                if (blocks.charAt(R) == 'B')
                    BW[0]++;
                else
                    BW[1]++;
                R++;
            }
            if (blocks.charAt(R) == 'B')
                BW[0]++;
            else
                BW[1]++;
            int count = BW[1];
            min = Math.min(count, min);
            if (blocks.charAt(L) == 'B')
                BW[0]--;
            else
                BW[1]--;
            L++;
        }
        return min;
    }
}