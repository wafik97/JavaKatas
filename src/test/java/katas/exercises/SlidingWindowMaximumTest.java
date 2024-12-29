package katas.exercises;

import static katas.exercises.SlidingWindowMaximum.maxSlidingWindow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SlidingWindowMaximumTest {

    @Test
    public void testMaxSlidingWindow() {



        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        List<Integer> expected1 = List.of(3, 3, 5, 5, 6, 7);
        assertEquals(expected1, maxSlidingWindow(nums1, k1), "Sliding window maximums mismatch");
        int[] nums2 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k2 = 1;
        List<Integer> expected2 = List.of(1, 3, -1, -3, 5, 3, 6, 7);
        assertEquals(expected2, maxSlidingWindow(nums2, k2), "Sliding window maximums mismatch");
        int[] nums3 = {1, 3, -1};
        int k3 = 5;
        List<Integer> expected3 = List.of();
        assertEquals(expected3, maxSlidingWindow(nums3, k3), "Sliding window maximums mismatch");
        int[] nums4 = {};
        int k4 = 3;
        List<Integer> expected4 = List.of();
        assertEquals(expected4, maxSlidingWindow(nums4, k4), "Sliding window maximums mismatch");
        int[] nums5 = {-1, -3, -2, -5, -4, -7};
        int k5 = 3;
        List<Integer> expected5 = List.of(-1, -2, -2, -4);
        assertEquals(expected5, maxSlidingWindow(nums5, k5), "Sliding window maximums mismatch");


    }
}
