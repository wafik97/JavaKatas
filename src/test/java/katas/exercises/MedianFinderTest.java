package katas.exercises;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MedianFinderTest {

    private MedianFinder medianFinder;

    @BeforeEach
    void setUp() {
        medianFinder = new MedianFinder();
    }

    @Test
    void testSingleElement() {
        medianFinder.addNum(5);
        assertEquals(5.0, medianFinder.findMedian(), "Median should be 5");
    }

    @Test
    void testTwoElements() {
        medianFinder.addNum(3);
        medianFinder.addNum(7);
        assertEquals(5.0, medianFinder.findMedian(), "Median should be 5");
    }

    @Test
    void testOddNumberOfElements() {
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        assertEquals(2.0, medianFinder.findMedian(), "Median should be 2");
    }

    @Test
    void testEvenNumberOfElements() {
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        medianFinder.addNum(4);
        assertEquals(2.5, medianFinder.findMedian(), "Median should be 2.5");
    }

    @Test
    void testUnorderedInput() {
        medianFinder.addNum(10);
        medianFinder.addNum(3);
        medianFinder.addNum(8);
        medianFinder.addNum(2);
        medianFinder.addNum(5);
        assertEquals(5.0, medianFinder.findMedian(), "Median should be 5");
    }
}
