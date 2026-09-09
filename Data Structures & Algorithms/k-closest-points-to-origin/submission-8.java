class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[] distances = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            double distance = Math.sqrt(point[0] * point[0] + point[1] * point[1]);
            distances[i] = distance;
        }
        quickSelect(points, distances, 0, points.length, k);
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) result[i] = points[i];
        return result;
    }
    private void quickSelect(int[][] points, double[] distances, int start, int end, int k) {
        if (end - start <= 1)
            return;
        int left = start, pivot = end - 1;
        for (int i = start; i < pivot; i++) {
            if (distances[i] <= distances[pivot]) {
                double temp = distances[i];
                distances[i] = distances[left];
                distances[left] = temp;
                int[] temp2 = points[i];
                points[i] = points[left];
                points[left] = temp2;
                left++;
            }
        }
        double temp = distances[pivot];
        distances[pivot] = distances[left];
        distances[left] = temp;
        int[] temp2 = points[pivot];
        points[pivot] = points[left];
        points[left] = temp2;
        if (k == left)
            return;
        else if (k < left)
            quickSelect(points, distances, start, left, k);
        else
            quickSelect(points, distances, left + 1, end, k);
    }
}

