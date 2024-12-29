package katas.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxStorageCapacityTest {

    @Test
    public void testMaxStorageArea() {



        int[] containers1 = {2, 1, 5, 6, 2, 3};
        int expected1 = 10;
        int result1 = MaxStorageCapacity.maxStorageArea(containers1);
        assertEquals(expected1, result1, "The maximum storage area should be 10.");


        int[] containers2 = {5};
        int expected2 = 5;
        int result2 = MaxStorageCapacity.maxStorageArea(containers2);
        assertEquals(expected2, result2, "The maximum storage area should be 5.");


        int[] containers3 = {3, 3, 3, 3, 3};
        int expected3 = 15;
        int result3 = MaxStorageCapacity.maxStorageArea(containers3);
        assertEquals(expected3, result3, "The maximum storage area should be 15.");


        int[] containers4 = {6, 5, 4, 3, 2, 1};
        int expected4 = 12;
        int result4 = MaxStorageCapacity.maxStorageArea(containers4);
        assertEquals(expected4, result4, "The maximum storage area should be 12.");


        int[] containers5 = {1, 2, 3, 4, 5, 6};
        int expected5 = 12;
        int result5 = MaxStorageCapacity.maxStorageArea(containers5);
        assertEquals(expected5, result5, "The maximum storage area should be 12.");


        int[] containers6 = {};
        int expected6 = 0;
        int result6 = MaxStorageCapacity.maxStorageArea(containers6);
        assertEquals(expected6, result6, "The maximum storage area for an empty array should be 0.");
    }
}
