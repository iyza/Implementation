package Tests.Lists;

import Lists.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue<Integer> listTest = new Queue<>();
    private int taille = 4;

    @BeforeEach
    void setUp() {
        for (int i=0;i<taille;i++) {
            listTest.add(i);
        }
    }

    @Test
    void remove() {
        assertEquals((Integer) 0, listTest.remove());
    }

    @Test
    void clear() {
        listTest.clear();
        assertEquals(3, listTest.size());
    }

    @Test
    void size() {
        assertEquals(4, listTest.size());
    }

    @Test
    void peek() {
        assertEquals((Integer) 0, listTest.peek());
    }

    @Test
    void add() {
        listTest.add(10);
        assertEquals((Integer) 10, listTest.peek());
    }

}