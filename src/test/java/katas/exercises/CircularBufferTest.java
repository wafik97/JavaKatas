

package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CircularBufferTest {

    @Test
    public void testCircularBuffer() {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        System.out.println(buffer.get()); // Output: 1
        assertEquals(1, buffer.get(), "the answer should be 1");
        buffer.add(4);
        System.out.println(buffer.get()); // Output: 2
        assertEquals(2, buffer.get(), "the answer should be 2");
        buffer.add(5);
        System.out.println(buffer.isFull()); // Output: true
        assertTrue(buffer.isFull(), "the answer should be true");
    }
}


