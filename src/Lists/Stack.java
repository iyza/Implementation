package Lists;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

public class Stack<T> {

    private LinkedList<T> list = new LinkedList<>();

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        int taille = size();
        T temp = list.get(taille-1);
        list.remove(taille-1);
        return temp;
    }

    public T peek() {
        int taille = size();
        return list.get(taille-1);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return size();
    }

}
