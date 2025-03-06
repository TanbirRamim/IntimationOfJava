public class Main {
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display the graph
        graph.printGraph();
        // performing graph
        // Perform BFS traversal
        graph.bfsTraversal(0);
    }
}