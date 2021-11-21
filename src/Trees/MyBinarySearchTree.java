package Trees;

public class MyBinarySearchTree <T extends Comparable<? super T>>{

    // Same with "BinaryTreeNode" class
    private static class BinaryNode<T>{

        private T element;               // The data in the node
        private BinaryNode<T> leftNode;  // The left child
        private BinaryNode<T> rightNode; // The right child

        //Constructors

        public BinaryNode(T data,BinaryNode<T> left,BinaryNode<T> right){

            this.element = data;
            this.leftNode = left;
            this.rightNode = right;

        }

        public BinaryNode(T data){

            this(data,null,null);

        }

        // Getters & Setters


        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public BinaryNode<T> getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(BinaryNode<T> leftNode) {
            this.leftNode = leftNode;
        }

        public BinaryNode<T> getRightNode() {
            return rightNode;
        }

        public void setRightNode(BinaryNode<T> rightNode) {
            this.rightNode = rightNode;
        }

    }

    private BinaryNode<T> root; // root node of the tree
    
    public MyBinarySearchTree(){

        this.root = null;

    }


    // PUBLIC METHODS FOR GENERAL STRUCTURE OF THE TREE

    public void makeEmpty(){

        this.root = null;

    }

    public boolean isEmpty(){

        return this.root == null;

    }

    public boolean contains(T x){

        return contains(x,root);

    }

    public T findMin(){

        if (!isEmpty()){

            return findMin(root).element;

        }else{

            return null;

        }


    }

    public T findMax(){

        if (!isEmpty()){

            return findMax(root).element;

        }else{

            return null;

        }



    }

    public void insert(T x){

        root = insert(x,root);

    }

    public void remove(T x){

        root = remove(x,root);

    }

    /**
     * Print the tree contents in sorted order.
     */
    public void printTree(){

        if (isEmpty()){

            System.out.println("Empty Tree");

        }else{

            printTree(root);

        }

    }



    // PRIVATE RECURSIVE METHODS

    /**
     * Internal method to find an item in a subtree.
     * @param x is item to search for.
     * @param t the node that roots the subtree.
     * @return true if the item is found; false otherwise.
     */

    private boolean contains(T x,BinaryNode<T> t){

        if (t == null){

            return false;

        }

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0){

            return contains(x,t.leftNode);

        }else if (compareResult > 0){

            return contains(x,t.rightNode);

        }else{

            return true; // match situation

        }

    }

    /**
     * Internal method to find the smallest item in a subtree.
     * @param t the node that roots the subtree.
     * @return node containing the smallest item.
     */

    private BinaryNode<T> findMin(BinaryNode<T> t){

        if (t == null){

            return null;

        }else if(t.leftNode == null){

            return t;

        }

        return findMin(t.leftNode);

    }

    /**
     * Internal method to find the largest item in a subtree.
     * @param t the node that roots the subtree.
     * @return node containing the largest item.
     */

    private BinaryNode<T> findMax(BinaryNode<T> t){

        if (t != null){

            while (t.rightNode != null){

                t = t.rightNode;

            }

        }

        return t;


    }

    /**
     * Internal method to insert into a subtree.
     * @param x the item to insert.
     * @param t the node that roots the subtree.
     * @return the new root of the subtree.
     */

    private BinaryNode<T> insert(T x,BinaryNode<T> t){

        if (t == null){

            return new BinaryNode<>(x,null,null);

        }

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0){

            t.leftNode = insert(x,t.leftNode);

        }else if(compareResult > 0){

            t.rightNode = insert(x,t.rightNode);

        }

        return t;

    }

    /**
     * Internal method to remove from a subtree.
     * @param x the item to remove.
     * @param t the node that roots the subtree.
     * @return the new root of the subtree.
     */

     private BinaryNode<T> remove(T x,BinaryNode<T> t){

        if (t == null){

            return null;

        }

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0){

            t.leftNode = remove(x,t.leftNode);

        }else if(compareResult > 0){

            t.rightNode = remove(x,t.rightNode);

        }else if(t.rightNode != null && t.leftNode != null){

            // Node with two children process
            t.element = findMin(t.rightNode).element;
            t.rightNode = remove(t.element,t.rightNode);


        }else{

            t = (t.leftNode != null) ? t.leftNode : t.rightNode;

        }

        return t;

     }

    /**
     * Internal method to print a subtree in sorted order.
     * @param t the node that roots the subtree.
     */

     private void printTree(BinaryNode<T> t){

         if (t != null){

             printTree(t.leftNode);
             System.out.println(t.element);
             printTree(t.rightNode);

         }

     }




}
