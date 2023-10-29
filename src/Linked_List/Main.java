package Linked_List;

public class  Main {
    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(7);
//        list.insertLast(99);
//        list.display();
//        list.insert(45,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(8));
//        System.out.println(list.find(100));

//        DLL list = new DLL();
//
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(7);
//        list.display();
//        list.insertLast(99);
//        list.display();
//        list.insert(99,3);
//        list.display();

        CLL list = new CLL();

        list.insert(99);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
        list.delete(3);
        list.display();

    }
}
