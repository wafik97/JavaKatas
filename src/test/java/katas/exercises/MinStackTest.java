package katas.exercises;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MinStackTest {


    @Test
    public void testMinStackOperations() {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);

        assertEquals(-3, stack.getMin());

        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }

    @Test
    public void testSingleElement() {
        MinStack stack = new MinStack();
        stack.push(10);

        assertEquals(10, stack.getMin());
        assertEquals(10, stack.top());

        stack.pop();
        assertEquals(-1, stack.getMin());
        assertEquals(-1, stack.top());
    }

    @Test
    public void testDecreasingOrder() {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(3);
        stack.push(1);

        assertEquals(1, stack.getMin());

        stack.pop();
        assertEquals(3, stack.getMin());

        stack.pop();
        assertEquals(5, stack.getMin());
    }

    @Test
    public void testIncreasingOrder() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(3);
        stack.push(5);

        assertEquals(1, stack.getMin());

        stack.pop();
        assertEquals(1, stack.getMin());

        stack.pop();
        assertEquals(1, stack.getMin());
    }

    @Test
    public void testEmptyStack() {
        MinStack stack = new MinStack();

        assertEquals(-1, stack.getMin());
        assertEquals(-1, stack.top());

        stack.pop();
    }
}
