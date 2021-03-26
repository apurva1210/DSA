package DataStructure.Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KClosestPointsToOrigin {

    public static void main(String[] args) {
        int[][] points = new int[][]{{1,3},{-2,2}};
        int k = 1;
        KClosestPointsToOrigin kClosestPointsToOrigin = new KClosestPointsToOrigin();
        int[][] closestPointsMy = kClosestPointsToOrigin.kClosest(points, k);

        System.out.println(Arrays.deepToString(closestPointsMy));
    }

    public int[][] kClosest(int[][] points, int K) {
        int[][] closestPoints = new int[K][2];
        List<Point> pointsList = new ArrayList<>();
        for (int[] point: points) {
            Point point1 = new Point(point[0], point[1]);
            pointsList.add(point1);
        }

        pointsList.sort((a, b) -> a.dist - b.dist);

        for (int i = 0; i < K ; i++) {
           Point point = pointsList.get(i);
           closestPoints[i] = new int[]{point.x, point.y};
        }

        return closestPoints;

    }

    static class Point{
        int x;
        int y;
        int dist;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x*x + y*y;
        }
    }
}
