package katas.exercises;

import static katas.exercises.ListFlatten.flattenList;
import static katas.exercises.LongestCommonPrefix.longestCommonPrefix;
import static katas.exercises.MatrixRotate.rotateMatrix;
import static katas.exercises.StringDigitSum.sumOfDigits;
import static katas.exercises.TrueCounter.countTrueValues;
import static katas.exercises.WordCounter.countWords;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class WordCounterTest {

    @Test
    public void testWordCounter() {

        boolean[] sampleArray = {true, false, true, true, false};
        boolean[] sampleArray1 = {false, false, false, false, false};

        int trueCount = countTrueValues(sampleArray);


        assertEquals(8,  countWords("This is a sample sentence for counting words."), "the answer should be 8");
        assertEquals(0, countWords(""), "the answer should be 0");


    }
}
