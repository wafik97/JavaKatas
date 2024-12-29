package katas.exercises;

import static katas.exercises.RequirementsCoverage.selectMinimalTestCases;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class RequirementsCoverageTest {

    @Test
    public void testSelectMinimalTestCases() {


        List<List<Integer>> testCases1 = List.of(List.of(1, 2, 3),List.of(1, 4),List.of(2, 3, 4), List.of(1, 5),    List.of(3, 5) );
        List<Integer> expected1 = List.of(2, 3);
        assertEquals(expected1, selectMinimalTestCases(testCases1), "The minimal test case subset is incorrect");


        List<List<Integer>> testCases2 = List.of( List.of(1, 2, 3) );
        List<Integer> expected2 = List.of(0);
        assertEquals(expected2, selectMinimalTestCases(testCases2), "The minimal test case subset is incorrect");


        List<List<Integer>> testCases3 = List.of(   List.of(1), List.of(2), List.of(3));
        List<Integer> expected3 = List.of(0, 1, 2);
        assertEquals(expected3, selectMinimalTestCases(testCases3), "The minimal test case subset is incorrect");


        List<List<Integer>> testCases4 = List.of();
        List<Integer> expected4 = List.of();
        assertEquals(expected4, selectMinimalTestCases(testCases4), "The minimal test case subset is incorrect");


        List<List<Integer>> testCases5 = List.of(   List.of(1, 2),  List.of(2, 3),  List.of(1, 3),  List.of(3, 4) );
        List<Integer> expected5 = List.of(0, 3);
        assertEquals(expected5, selectMinimalTestCases(testCases5), "The minimal test case subset is incorrect");


    }
}
