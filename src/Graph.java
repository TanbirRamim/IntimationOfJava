import java.util.*;

// Class to represent a Graph
public class Graph {
    private final int vertices; // Number of vertices
    private final List<List<Integer>> adjacencyList; // Adjacency list to store graph

    // Constructor to initialize the graph
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);

        // Uncomment the next line if you want an undirected graph
        // adjacencyList.get(destination).add(source);
    }

    // Method to perform Breadth-First Search (BFS) from a given starting vertex
    public void bfsTraversal(int startVertex) {
        boolean[] visited = new boolean[vertices]; // To track visited vertices
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        // Start from the given vertex
        visited[startVertex] = true;
        queue.offer(startVertex);

        System.out.println("BFS Traversal starting from vertex " + startVertex + ":");
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Explore all neighbors of the current vertex
            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Method to display the adjacency list of the graph
    public void printGraph() {
        System.out.println("Graph adjacency list:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

// that sums up everything here // 