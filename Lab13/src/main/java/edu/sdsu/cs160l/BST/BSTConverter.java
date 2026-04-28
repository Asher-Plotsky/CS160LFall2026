package edu.sdsu.cs160l.BST;


public class BSTConverter {

    /*
    * TODO: Given a sorted array of distinct integers,
    *  write a Java program to convert it into a Height Balanced Binary Search Tree (BST).
    *  do not use .insert() method in BST_class or hardcode a tree, use recursive call instead (sortedArrayToBST).
    */
    public static BST_class.Node sortedArrayToBST(int[] arr) {
        if(arr == null || arr.length == 0){
            return null;
        }
        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
            right[i] = arr[i + middle];
        }
        BST_class.Node root = new BST_class.Node(arr[middle]);
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        return root;
    }


    // Helper method for inorder traversal of the BST to view your output
    public static void inorderTraversal(BST_class.Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }

    /*
    * Here is an example of a sorted array we want to turn into a BST
    *  Note that if you do it correctly the inorderTraversal should return the
    *  array values in order: 1, 2, 3, 4, 5, 6, 7
     */
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};

        BST_class.Node root = sortedArrayToBST(sortedArray);
        System.out.println("Inorder Traversal of the BST:");
        inorderTraversal(root);

    }
}
