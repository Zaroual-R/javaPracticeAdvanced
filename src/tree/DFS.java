package tree;

public class DFS {
    public static void main(String[] args) {
        // Create the nodes (vertices)
        BfsNode node1 = new BfsNode(1);
        BfsNode node2 = new BfsNode(2);
        BfsNode node3 = new BfsNode(3);
        BfsNode node4 = new BfsNode(4);
        BfsNode node5 = new BfsNode(5);

        // Set up neighbors (edges)
        node1.getNeighbors().add(node2);
        node1.getNeighbors().add(node3);
        node2.getNeighbors().add(node4);
        node2.getNeighbors().add(node5);

        // Create a BFS object and traverse from node1
        DFS bfsTraversal = new DFS();
        System.out.println("BFS traversal starting from node 1:");
        bfsTraversal.traveseRecursively(node1);
    }

    public void traveseRecursively(BfsNode vertix){
        vertix.setVisited();
        System.out.println(vertix);
        vertix.getNeighbors().stream()
                .filter(neighbor -> !neighbor.isVesited())
                .forEach(this::traveseRecursively);
    }

}
