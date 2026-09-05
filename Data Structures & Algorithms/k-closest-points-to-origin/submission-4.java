class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[] distances = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            distances[i] = distance;
        }
        sort(points, distances, 0, points.length);
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) result[i] = points[i];
        return result;
    }
    private void sort(int[][] points, double[] distances, int start, int end) {
        if (end - start <= 1)
            return;
        int left = start, pivot = end - 1;
        for (int i = start; i < pivot; i++)
            if (distances[i] < distances[pivot]) {
                double temp = distances[i];
                distances[i] = distances[left];
                distances[left] = temp;
                int[] temp2 = points[i];
                points[i] = points[left];
                points[left] = temp2;
                left++;
            }
        double temp = distances[pivot];
        distances[pivot] = distances[left];
        distances[left] = temp;
        int[] temp2 = points[pivot];
        points[pivot] = points[left];
        points[left] = temp2;
        sort(points, distances, start, left);
        sort(points, distances, left + 1, end);
    }
}
