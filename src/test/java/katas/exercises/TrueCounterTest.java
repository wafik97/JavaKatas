package katas.exercises;

import static katas.exercises.ListFlatten.flattenList;
import static katas.exercises.LongestCommonPrefix.longestCommonPrefix;
import static katas.exercises.MatrixRotate.rotateMatrix;
import static katas.exercises.StringDigitSum.sumOfDigits;
import static katas.exercises.TrueCounter.countTrueValues;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class TrueCounterTest {

    @Test
    public void testTrueCounter() {

        boolean[] sampleArray = {true, false, true, true, false};
        boolean[] sampleArray1 = {false, false, false, false, false};

        int trueCount = countTrueValues(sampleArray);


        assertEquals(3, countTrueValues(sampleArray), "the answer should be 3");
        assertEquals(0, countTrueValues(sampleArray1), "the answer should be 0");


    }
}
