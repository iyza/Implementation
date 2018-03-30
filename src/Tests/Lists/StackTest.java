package Tests.Lists;

import Lists.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> listTest = new Stack<Integer>();
    private int taille = 5;
    @BeforeEach
    void setUp() {
        for (int i=0;i < taille; i++) {
            listTest.push(i);
        }
    }

    @Test
    void push() {
        listTest.push(414124);
        assertEquals((Integer) 414124, listTest.peek());
    }

    @Test
    void pop() {
        assertEquals((Integer) 4, listTest.pop());
        assertEquals((Integer) 3, listTest.pop());
        assertEquals((Integer) 2, listTest.pop());
        assertEquals((Integer) 1, listTest.pop());
        assertEquals((Integer) 0, listTest.pop());
    }

    @Test
    void peek() {
        assertEquals((Integer) 4, listTest.peek());
    }

    @Test
    void clear() {
        listTest.clear();
        assertEquals(0, listTest.size());
    }

    @Test
    void size() {
        assertEquals(5, listTest.size());
    }

}