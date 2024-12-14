package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayDifferenceTest {

    @Test
    public void testArrayDifference() {
        int[] sampleArray = {10, 3, 5, 6, 20, -2};
        assertEquals(22, ArrayDifference.findDifference(sampleArray), "the difference should be 22");
    }
}


