package GeeksForGeeks.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_DFS {

    private int vertices;   // No. of vertices

    // Array  of lists for Adjacency List
    private LinkedList<Integer> adj[];

    // Constructor
    public Graph_DFS(int v) {
        vertices = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList<>();
    }

    //Function to add an edge into the graph
    public void addEdge(int v, int w) {

        adj[v].add(w);  // Add w to v's list.
    }

    // A function used by DFS
    public void DFSUtil(int v,boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    public void DFS(int v) {
        // Mark all the vertices as not visited (by default)
        boolean visited[] = new boolean[vertices];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        Graph_DFS g = new Graph_DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(2);
    }

}
