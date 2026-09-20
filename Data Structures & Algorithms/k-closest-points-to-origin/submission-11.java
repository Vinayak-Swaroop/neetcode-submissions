class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pairs = new PriorityQueue<Pair>((a, b) -> Double.compare(a.distance,b.distance));
        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1]*points[i][1]);
            pairs.add(new Pair(distance, points[i]));
        }
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) {
            result[i] = pairs.poll().point;
        }
        return result;
    }
}
class Pair {
    double distance;
    int[] point;
    Pair(double distance, int[] point) {
        this.distance = distance;
        this.point = point;
    }
}
