package Lists;

public class LinkedList<T> implements List<T> {

    private Node head;
    private Node tail;
    private int objets = 0;

    public LinkedList() {
        head.setNext(tail);
    }

    public void add(T element) {
        if (objets == 0) {
            head.setElement(element);
        }
        else if (objets == 1) {
            tail.setElement(element);
        }
        else {
            tail.setNext(head);
        }
    }

    public void clear() {
        objets = 0;
    }

    public void size() {
        return objets;
    }

}
