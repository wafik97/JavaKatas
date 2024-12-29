package katas.exercises;

import static katas.exercises.TestCaseGrouping.groupTestCases;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestCaseGroupingTest {

    @Test
    public void testGroupTestCases() {




        List<Integer> testCaseGroupSizes1 = List.of(1, 2, 3, 3, 3, 2);
        List<List<Integer>> expected1 = List.of(List.of(0), List.of(2, 3, 4),List.of(1, 5));
        assertEquals(expected1, groupTestCases(testCaseGroupSizes1), "Test case grouping failed");
        List<Integer> testCaseGroupSizes2 = List.of(1, 1, 1, 1);
        List<List<Integer>> expected2 = List.of(List.of(0),List.of(1),List.of(2),List.of(3));
        assertEquals(expected2, groupTestCases(testCaseGroupSizes2), "Test case grouping failed");
        List<Integer> testCaseGroupSizes3 = List.of(3, 3, 3, 3, 3, 3);
        List<List<Integer>> expected3 = List.of(List.of(0, 1, 2),  List.of(3, 4, 5) );
        assertEquals(expected3, groupTestCases(testCaseGroupSizes3), "Test case grouping failed");
        List<Integer> testCaseGroupSizes4 = List.of();
        List<List<Integer>> expected4 = List.of();
        assertEquals(expected4, groupTestCases(testCaseGroupSizes4), "Test case grouping failed");
        List<Integer> testCaseGroupSizes5 = List.of(1);
        List<List<Integer>> expected5 = List.of(List.of(0));
        assertEquals(expected5, groupTestCases(testCaseGroupSizes5), "Test case grouping failed");


    }
}
