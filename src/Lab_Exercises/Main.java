package Lab_Exercises;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myList = new MyLinkedList<>();

        myList.add(2);
        myList.add(0);
        myList.add(2);
        myList.add(0);
        myList.add(0);
        myList.add(6);
        myList.add(0);
        myList.add(2);
        myList.add(0);
        myList.add(3);
        myList.add(6);

        myList.printList();

        System.out.println("\n"+myList.search(3));

        myList.delete(3);

        myList.printList();

        myList.addAt(7,1);

        System.out.println();

        myList.printList();

        System.out.println();

        MyLinkedList<String> myName = new MyLinkedList<>();

        myName.add("Onur");

        myName.printList();

        myName.addAt("Öztop",1);

        myName.addAt("IEU",2);

        System.out.println();

        myName.printList();

        myName.removeAt(2);

        myName.printList();

        System.out.println();

        System.out.println(myList.getNth(0));
        System.out.println(myList.getNth(1));
        System.out.println(myList.getNth(2));
        System.out.println(myList.getNth(3));
        System.out.println(myList.getNth(4));
        System.out.println(myList.getNth(5));
        System.out.println(myList.getNth(6));
        System.out.println(myList.getNth(7));
        System.out.println(myList.getNth(8));
        System.out.println(myList.getNth(9));
        System.out.println(myList.getNth(10));






    }
}
