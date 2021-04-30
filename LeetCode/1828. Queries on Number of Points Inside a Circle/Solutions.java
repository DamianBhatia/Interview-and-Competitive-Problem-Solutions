/*
You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane. Multiple points can have the same coordinates.

You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.

For each query queries[j], compute the number of points inside the jth circle. Points on the border of the circle are considered inside.

Return an array answer, where answer[j] is the answer to the jth query.

EXAMPLE 1:
Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
Output: [3,2,2]
Explanation: The points and circles are shown above.
queries[0] is the green circle, queries[1] is the red circle, and queries[2] is the blue circle.

EXAMPLE 2:
Input: points = [[1,1],[2,2],[3,3],[4,4],[5,5]], queries = [[1,2,2],[2,2,2],[4,3,2],[4,3,3]]
Output: [2,3,2,4]
Explanation: The points and circles are shown above.
queries[0] is green, queries[1] is red, queries[2] is blue, and queries[3] is purple.
*/

class Solution {
    // Overall Time Complexity O(n*m)
    // Space Complexity is O(n)
    public int[] countPoints(int[][] points, int[][] queries) {
        
        // O(n) space
        int nums[] = new int[queries.length];
        
        // Time Complexity O(n)
        for(int i = 0; i < queries.length; ++i) {
            // Time Complexity O(m)
            for(int k = 0; k < points.length; ++k) {
                double distance = distance(queries[i][0], queries[i][1], points[k][0], points[k][1]);
                if(distance <= queries[i][2]) {
                    nums[i]++;
                }
            }
        }
        return nums;
    }
    
    // Time Complexity O(1)
    public double distance(int x1, int y1, int x2, int y2) {
        int a = x1 - x2;
        int b = y1 - y2;
        
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
