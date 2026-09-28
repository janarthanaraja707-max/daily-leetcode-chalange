import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] indegree = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();

        
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

    
        for (int[] p : prerequisites) {
            int course = p[0];
            int pre = p[1];

            graph.get(pre).add(course);
            indegree[course]++;
        }

    
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        
        while (!queue.isEmpty()) {

            int course = queue.poll();

            result[index++] = course;

            for (int next : graph.get(course)) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.add(next);
                }
            }
        }

        
        if (index != numCourses) {
            return new int[0];
        }

        return result;
    }
}