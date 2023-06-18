
public class MyLinkedList implements MyList {

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count;

    public MyLinkedList() {
        this.count = 0;
    }


    @Override
    public void add(int element) {
        Node newNode = new Node(element);

        if (count == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
        count++;
    }

    @Override
    public void addFirst(int element) {
        Node newNode = new Node(element);

        if (first != null) {
            newNode.next = first;
        } else {
            last = newNode;
        }

        first = newNode;
        count++;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void remove(int index) {
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            System.err.println("Неверный индекс - " + index);
            return -1;
        }

        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    public MyIterator iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements MyIterator{
        private Node current;

        int next;
        public MyLinkedListIterator() {
            this.current = null;
            this.next = 0;
        }

        @Override
        public int next() {
            if (current == null) {
                current = first;
                next++;
                return current.value;
            }
            current = current.next;
            next++;
            return current.value;
        }

        @Override
        public boolean hasNext() {
            return next < count;
        }
    }
}
