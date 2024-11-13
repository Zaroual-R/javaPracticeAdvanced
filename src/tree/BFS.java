package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

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
        BFS bfsTraversal = new BFS();
        System.out.println("BFS traversal starting from node 1:");
        bfsTraversal.traveseRecursively(node1);
    }

    public void traveseRecursively(BfsNode vertix){
        Queue<BfsNode> queue = new LinkedList<BfsNode>();
        vertix.setVisited();
        queue.add(vertix);
        while(!queue.isEmpty()){
            BfsNode curentNode=queue.poll();
            System.out.println(curentNode);
            for(BfsNode neighbor: curentNode.getNeighbors()){
                neighbor.setVisited();
                queue.add(neighbor);
            }
        }


    }
}
