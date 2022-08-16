package SearchAlgorithms;
import java.util.*;

public class Graph {
    private LinkedList<Integer> adj[];
    private int V;
    private Queue<Integer> queue;

    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    void depthFirstSearch(int v, boolean nodes[]) {
        nodes[v] = true;
        System.out.print(v + " ");

        int a = 0;
        for(int i = 0; i < adj[v].size(); i++) {
            a = adj[v].get(i);
            if (!nodes[a])                    
            {
                depthFirstSearch(a, nodes);
            }
        }
    }

    public void DFS(int v) {
        boolean visited[] = new boolean[V];
        depthFirstSearch(v, visited);
    }

    public void BFS(int v) {
        boolean visited[] = new boolean[V];
        int a = 0;

        visited[v] = true;
        queue.add(v);

        while(queue.size() != 0) {
            v = queue.poll();
            System.out.print(v + " ");

            for(int i = 0; i < adj[v].size(); i++) {
                a = adj[v].get(i);
                if (!visited[a]) {
                    visited[a] = true;
                    queue.add(a);
                }
            }
        }
    }
}
