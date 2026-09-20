class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[] distances = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            distances[i] = distance;
        }
        quickSelect(distances, points, 0, points.length, k);
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) result[i] = points[i];
        return result;
    }
    private void quickSelect(double[] distances, int[][] points, int start, int end, int k) {
        if(end-start<=1)
            return;
        int left = start, pivot = end - 1;
        for (int i = start; i < pivot; i++) {
            if (distances[i] < distances[pivot]) {
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
        pivot = left;
        if (k == pivot)
            return;
        else if (k < pivot)
            quickSelect(distances, points, start, pivot, k);
        else
            quickSelect(distances, points, pivot+1, end, k);
    }
}
