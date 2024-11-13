package tree;

public class BinarySearshTree {
    public Node root=null;
    static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data) {
            this.data = data;
        }
    }

    // function that takes a root of the tree and the value to insert
    public void insert(Node root, int key){
        // we have to check first if the tree is empty , if it is so we return a node with iserted value
        if(root ==null) {
            root.data=key;
        }
        // if the tree is not empty
        // we have to traverse all the tree
        // and check if the insrted value is lesser than the root
        if(key<root.data){
            // if the left node is not null than we pass the value to the left node
            if(root.leftNode!=null){
                insert(root.leftNode,key);

            }
            // if the left node of the node is null than we have to set it with a node with the inserted value
            else{
                root.leftNode=new Node(key);
            }

        }
        // if the value is greater than the root so we have to put it in the right subtree
        else{
            // inset  the value in the right of subtree if of right node if it not null
            if(root.rightNode!=null){
                insert(root.rightNode,key);
            }
            // set the right node as our iserted node
            else{
                root.rightNode=new Node(key);
            }
        }

    }
    public Node delete(Node root, int value){
         // firstly we have to check if the root is null if it is then we return the root beceaus our value doesn't exist in the tree
         if(root ==null){
             return root ;
         }
         //traverse the tree to find the nood
         if(value<root.data){
             // return the modified root of the left subtree
             root.leftNode=delete(root.leftNode,value);
         }
         else if(value>root.data){
             // return the modified root of the right subtree
             root.rightNode=delete(root.rightNode, value);
         }
         else{
             // node id found

             // case 1 : leaf node
             if(root.leftNode==null && root.rightNode==null){
                 return null ;
             }

             // case 2: one child
             if (root.leftNode==null){
                 return root.rightNode;
             }
             if(root.rightNode==null){
                 return root.leftNode;
             }

             // case 3 :the node has two childs
             // find the smallest node in the right subtree
             root.data=findSmallestRight(root.rightNode);

             // delete the inorder succesor
             root.rightNode=delete(root.rightNode,root.data);

         }

         return root;

    }

    private  int  findSmallestRight(Node root) {
        int minVlaue = root.data;
        while (root.leftNode != null) {
            root = root.leftNode;
            minVlaue = root.data;
        }
        return minVlaue;
    }


    public void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.leftNode);
            System.out.println(root.data+" ");
            inorderTraversal(root.rightNode);
        }
    }
    public void postOrderTraversal(Node root){
        if(root!=null){
            postOrderTraversal(root.leftNode);
            postOrderTraversal(root.rightNode);
            System.out.println(root.data+" ");
        }
    }

    public void preOrderTraversal(Node root){
        if(root!=null){
            System.out.println(root.data+" ");
            preOrderTraversal(root.leftNode);
            preOrderTraversal(root.rightNode);
        }
    }

    public Node searshNode(Node  root,int key){
        if(root==null || root.data==key){
            return root;
        }
        if(key<root.data){
            return searshNode(root.leftNode,key);
        }
        return searshNode(root.rightNode,key);

    }


}
