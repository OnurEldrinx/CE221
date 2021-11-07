package Double_Linked_List;

public class Main {
    public static void main(String[] args) {

        DLL<Integer> mySchoolNumber = new DLL<>();

        mySchoolNumber.append(2);
        mySchoolNumber.append(0);
        mySchoolNumber.append(2);
        mySchoolNumber.append(0);
        mySchoolNumber.append(0);
        mySchoolNumber.append(6);
        mySchoolNumber.append(0);
        mySchoolNumber.append(2);
        mySchoolNumber.append(0);
        mySchoolNumber.append(3);
        mySchoolNumber.append(6);

        mySchoolNumber.printList();
        System.out.println();
        mySchoolNumber.printListReversal();
        System.out.println();
        mySchoolNumber.delete(mySchoolNumber.head.next);
        mySchoolNumber.printList();

        System.out.println();

        DLL<Integer> myList = new DLL<>();

        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        myList.append(6);


        myList.printList();


        System.out.println();

        System.out.println(myList.getNth(0));
        System.out.println(myList.getNth(1));
        System.out.println(myList.getNth(2));
        System.out.println(myList.getNth(3));
        System.out.println(myList.getNth(4));
        System.out.println(myList.getNth(5));

    }
}


