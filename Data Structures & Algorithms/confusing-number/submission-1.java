class Solution {
    public boolean confusingNumber(int n) {
        int originalNumber = n;
        int rotatedNumber = 0;
        Map<Integer, Integer> rotation = Map.of(0, 0, 1, 1, 6, 9, 8, 8, 9, 6);
        while (n > 0) {
            int num = n % 10;
            if (!rotation.containsKey(num))
                return false;
            int rotatedNum = rotation.get(num);
            rotatedNumber = rotatedNumber * 10 + rotatedNum;
            n /= 10;
        }
        if (rotatedNumber == originalNumber)
            return false;
        return true;
    }
}
