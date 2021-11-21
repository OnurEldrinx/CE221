package Trees;

public class Main {
    public static void main(String[] args) {

        MyBinarySearchTree<Integer> myTree = new MyBinarySearchTree<>();

        System.out.println(myTree.isEmpty());
        myTree.printTree();

        myTree.insert(2);
        myTree.insert(0);
        myTree.insert(2);
        myTree.insert(0);
        myTree.insert(0);
        myTree.insert(6);
        myTree.insert(0);
        myTree.insert(2);
        myTree.insert(0);
        myTree.insert(3);
        myTree.insert(6);

        myTree.printTree();

        System.out.println(myTree.findMax());
        System.out.println(myTree.findMin());

        myTree.remove(6);
        myTree.remove(2);


        System.out.println("----------------------------------------");

        myTree.printTree();

        System.out.println(myTree.findMax());
        System.out.println(myTree.findMin());


    }
}
