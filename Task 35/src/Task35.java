
public class Task35 {
    public static void main(String[] args) {

        MyList myList = new MyLinkedList();

        myList.add(77);
        myList.add(89);
        myList.addFirst(60);
        myList.addFirst(10);

        System.out.println(myList.get(0)); // 10
        System.out.println(myList.get(1)); // 60
        System.out.println(myList.get(2)); // 77
        System.out.println(myList.get(3)); // 89

        ;

        MyIterator iterator = myList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
