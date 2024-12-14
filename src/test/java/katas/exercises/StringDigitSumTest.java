package katas.exercises;

import static katas.exercises.ListFlatten.flattenList;
import static katas.exercises.LongestCommonPrefix.longestCommonPrefix;
import static katas.exercises.MatrixRotate.rotateMatrix;
import static katas.exercises.StringDigitSum.sumOfDigits;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class StringDigitSumTest {

    @Test
    public void testStringDigitSum() {

        String input1 = "abc123";
        String input2 = "5 cats and 2 dogs";
        String input3 = "No digits here!";




        assertEquals(6, sumOfDigits(input1), "the answer should be 6");
        assertEquals(7, sumOfDigits(input2), "the answer should be 7");
        assertEquals(0, sumOfDigits(input3), "the answer should be 0");


    }
}
