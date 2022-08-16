import java.util.ArrayList;
import SearchAlgorithms.*;

class SearchAlgorithms {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int x = 10;

        fillList(list, 100);

        System.out.println("Original List: " + list);

        System.out.println();

        int resultILS = LinearSearch.iterativeLS(list, x);
        if (resultILS == -1) {
            System.out.print("(Iterative Linear Search) Element " + x + " is not present in the list.");
        }
        else {
            System.out.print("(Iterative Linear Search) Element " + x + " is present at index: " + resultILS);
        }

        System.out.println();

        int resultRLS = LinearSearch.recursiveLS(list, x, list.size());
        if (resultRLS == -1) {
            System.out.print("(Recursive Linear Search) Element " + x + " is not present in the list.");
        }
        else {
            System.out.print("(Recursive Linear Search) Element " + x + " is present at index: " + resultRLS);
        }

        System.out.println();

        int resultIBS = BinarySearch.iterativeBS(list, x, 0, list.size() - 1);
        if (resultIBS == -1) {
            System.out.print("(Iterative Binary Search) Element " + x + " is not present in the list.");
        }
        else {
            System.out.print("(Iterative Binary Search) Element " + x + " is present at index: " + resultIBS);
        }

        System.out.println();

        int resultRBS = BinarySearch.recursiveBS(list, x, 0, list.size() - 1);
        if (resultRBS == -1) {
            System.out.print("(Recursive Binary Search) Element " + x + " is not present in the list.");
        }
        else {
            System.out.print("(Recursive Binary Search) Element " + x + " is present at index: " + resultRBS);
        }

        System.out.println();

        Tree tree = new Tree();
        Tree.BinaryTree bst = tree.new BinaryTree();
        /*    45 
           /     \ 
          10      90 
         /  \    /   
        7   12  50   */

        bst.insert(45); 
        bst.insert(10); 
        bst.insert(7); 
        bst.insert(12); 
        bst.insert(90); 
        bst.insert(50);

        System.out.println("\nPreorder traversal of BST: ");
        bst.printPreOrder();

        System.out.println("\nInorder traversal of BST: ");
        bst.printInOrder();

        System.out.println("\nPostorder traversal of BST: ");
        bst.printPostOrder();

        System.out.println("\nBreadth First Search of BST: ");
        bst.levelOrder();

        bst.delete(12);
        System.out.println("\nInorder traversal of BST after deleting 12: ");
        bst.printInOrder();

        bst.delete(90);
        System.out.println("\nInorder traversal of BST after deleting 90: ");
        bst.printInOrder();

        System.out.println();

        Graph graph = new Graph(5);

        /*
                0 - 1 \
                | / |  2
                4 - 3 /
         */

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("\nDepth First Search from Vertex 0: ");
        graph.DFS(0);

        System.out.println("\nBreadth First Search from Vertex 0: ");
        graph.BFS(0);
    } 

    /*
     * fillList
     * 
     * Fills an empty arrayList with Integer values from [0,1000) according to the size passed to the method
     */
    public static void fillList(ArrayList<Integer> list, int size) {
        for(int x = 0; x < size; x++) {
            list.add((int) (Math.random() * 1000));
        }
    }
}