package Trees;

public class BinaryTreeNode<T> {

    private T element;                   // The data in the node
    private BinaryTreeNode<T> leftNode;  // The left child
    private BinaryTreeNode<T> rightNode; // The right child


    // Constructors

    public BinaryTreeNode(T data,BinaryTreeNode<T> left,BinaryTreeNode<T> right){

        this.element = data;
        this.leftNode = left;
        this.rightNode = right;

    }

    public BinaryTreeNode(T data){

        this(data,null,null);

    }


    // Setters & Getters


    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BinaryTreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }
}
