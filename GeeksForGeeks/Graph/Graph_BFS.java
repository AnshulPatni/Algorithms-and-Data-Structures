package GeeksForGeeks.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_BFS {

    private int vertices;       // No. of vertices
    private LinkedList<Integer> adjacent[];

    // Constructor
    Graph_BFS(int v) {
        vertices = v;
        adjacent = new LinkedList[v];

        for(int i = 0; i < v; ++i) {
            adjacent[i] = new LinkedList<>();
        }
    }

    // Function to add an edge to a vertice in the graph
    public void addEdge(int v, int w) {
        adjacent[v].add(w);
    }

    // Prints BFS traversal from a given source
    public void BFS(int s) {
        // Mark all the vertices as not visited(default value is false)
        boolean[] visited = new boolean[vertices];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.println(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adjacent[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method to
    public static void main(String args[])
    {
        Graph_BFS g = new Graph_BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }

}
