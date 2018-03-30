package Lists;

public interface List<T>{

    void add(T element);
    void add(int index, T element);
    void set(int index, T element);
    T get(int index);
    void remove(int index);
    void clear();
    int size();

}
