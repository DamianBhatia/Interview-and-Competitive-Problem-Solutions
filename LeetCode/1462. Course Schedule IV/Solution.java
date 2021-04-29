/*
There are a total of n courses you have to take, labeled from 0 to n-1.

Some courses may have direct prerequisites, for example, to take course 0 you have first to take course 1, which is expressed as a pair: [1,0]

Given the total number of courses n, a list of direct prerequisite pairs and a list of queries pairs.

You should answer for each queries[i] whether the course queries[i][0] is a prerequisite of the course queries[i][1] or not.

Return a list of boolean, the answers to the given queries.

Please note that if course a is a prerequisite of course b and course b is a prerequisite of course c, then, course a is a prerequisite of course c.

EXAMPLE 1:
Input: n = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
Output: [false,true]
Explanation: course 0 is not a prerequisite of course 1 but the opposite is true.

EXAMPLE 2:
Input: n = 2, prerequisites = [], queries = [[1,0],[0,1]]
Output: [false,false]
Explanation: There are no prerequisites and each course is independent.

EXAMPLE 3:
Input: n = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
Output: [true,true]
*/

// Initial Solution
// Works fine but time taken for a large graph is too slow.
class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        
        List<Boolean> list = new ArrayList<Boolean>();
        
        for(int[] query : queries) {
          list.add(dfs(n, query, prerequisites));
        }
        
        return list;
    }
    
    
    public boolean dfs(int n, int[] query, int[][] prereq) {
        boolean visited[] = new boolean[n];
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(query[0]);
        
        while(!stack.isEmpty()) {
            int current = stack.pop();
            visited[current] = true;

            for(int i = 0; i < prereq.length; ++i) {
                
                if(prereq[i][0] == current && prereq[i][1] == query[1]) {
                    return true;
                }
                
                if(prereq[i][0] == current && !visited[prereq[i][1]]) {
                    stack.push(prereq[i][1]);
                }
            }
        }
        
        return false;
    }
}
