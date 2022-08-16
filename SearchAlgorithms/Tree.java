package SearchAlgorithms;

public class Tree {
    class Node {
        int data;
        Node left, right;

        public Node(int i) {
            data = i;
            left = right = null;
        }
    }

    public class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        // Depth First Search

        void postOrder(Node node) {
            if(node == null) {
                return;
            }

            postOrder(node.left);
            postOrder(node.right);

            System.out.print(node.data + " ");
        }

        void inOrder(Node node) {
            if(node == null) {
                return;
            }

            inOrder(node.left);

            System.out.print(node.data + " ");
            
            inOrder(node.right);
        }

        void preOrder(Node node) {
            if(node == null) {
                return;
            }

            System.out.print(node.data + " ");

            preOrder(node.left);
            preOrder(node.right);
        }

        public void printPostOrder() {
            postOrder(root);
        }

        public void printInOrder() {
            inOrder(root);
        }

        public void printPreOrder() {
            preOrder(root);
        }

        // Breadth First Search

        public void levelOrder() {
            int height = height(root);

            for(int i = 1; i <= height; i++) {
                currentLevel(root, i);
            }
        }

        int height(Node root) {
            if(root == null) {
                return 0;
            }
            else {
                int leftHeight = height(root.left);
                int rightHeight = height(root.right);

                if(leftHeight > rightHeight) {
                    return (leftHeight + 1);
                }
                else {
                    return (rightHeight + 1);
                }
            }
        }

        void currentLevel(Node root, int level) {
            if(root == null) {
                return;
            }

            if (level == 1) {
                System.out.print(root.data + " ");
            }
            else if (level > 1) {
                currentLevel(root.left, level - 1);
                currentLevel(root.right, level - 1);
            }
        }

        public void insert(int data) {
            root = insertNode(root, data);
        }

        Node insertNode(Node temp, int data) {
            if(temp == null) {
                temp = new Node(data);
                return temp;
            }

            if(data < temp.data) {
                temp.left = insertNode(temp.left, data);
            }
            else if(data > temp.data) {
                temp.right = insertNode(temp.right, data);
            }

            return temp;
        }

        public void delete(int data) {
            root = deleteNode(root, data);
        }

        Node deleteNode(Node root, int data) {
            if(root == null) {
                return root;
            }

            if(data < root.data) {
                root.left = deleteNode(root.left, data);
            }
            else if(data > root.data) {
                root.right = deleteNode(root.right, data);
            }
            else {
                if(root.right == null) {
                    return root.left;
                }
                else if(root.left == null) {
                    return root.right;
                }

                int min = root.data;
                while(root.left != null) {
                    min = root.left.data;
                    root = root.left;
                }
                root.data = min;

                root.right = deleteNode(root.right, root.data);
            }

            return root;
        }
    }
    
}
