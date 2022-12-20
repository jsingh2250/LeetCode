import java.util.HashSet;

// There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.

// You want to determine if there is a valid path that exists from vertex source to vertex destination.

// Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.

// Constraints:
// 1 <= n <= 2 * 10^5
// 0 <= edges.length <= 2 * 10^5
// edges[i].length == 2
// 0 <= ui, vi <= n - 1
// ui != vi
// 0 <= source, destination <= n - 1
// There are no duplicate edges.
// There are no self edges.

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }

        HashSet<Integer> connectedToSource = new HashSet<>();
        HashSet<Integer> connectedToDestination = new HashSet<>();

        connectedToSource.add(source);
        connectedToDestination.add(destination);

        boolean isNewPathFound = true;
        while (isNewPathFound) {
            isNewPathFound = false;

            for (int[] edge : edges) {
                isNewPathFound = (connectedToSource.contains(edge[0]) && connectedToSource.add(edge[1]));
                isNewPathFound |= (connectedToSource.contains(edge[1]) && connectedToSource.add(edge[0]));
                isNewPathFound |= (connectedToDestination.contains(edge[0]) && connectedToDestination.add(edge[1]));
                isNewPathFound |= (connectedToDestination.contains(edge[1]) && connectedToDestination.add(edge[0]));

                if ((connectedToSource.contains(edge[0]) && connectedToDestination.contains(edge[0])) ||
                        (connectedToSource.contains(edge[1]) && connectedToDestination.contains(edge[1]))) {
                    return true;
                }
            }
        }

        return false;
    }
}