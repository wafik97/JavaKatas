package katas.exercises;

import static katas.exercises.ArrayReducer.reduceArray;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayReducerTest {

    @Test
    public void testArrayReducer() {

        int[] sampleArray = {10, 15, 7, 20, 25};
        reduceArray(sampleArray);


        assertEquals(10, sampleArray[0], "the number in the array is wrong");
        assertEquals(5, sampleArray[1], "the number in the array is wrong");
        assertEquals(-8, sampleArray[2], "the number in the array is wrong");
        assertEquals(13, sampleArray[3], "the number in the array is wrong");
        assertEquals(5, sampleArray[4], "the number in the array is wrong");
    }
}


