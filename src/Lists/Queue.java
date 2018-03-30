package Lists;

public class Queue<T> {

    private LinkedList<T> list = new LinkedList<>();

    public T remove() {
        if (size() == 0) {
            System.out.println("Pas d'objets");
        }
        else {
            T temp = list.get(0);
            list.remove(0);
            return temp;
        }

        return null;
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return size();
    }

    public T peek() {
        return list.get(0);
    }

    public void add(T element) {
        list.add(element);
    }

}
