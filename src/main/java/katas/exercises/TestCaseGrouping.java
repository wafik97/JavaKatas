package katas.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCaseGrouping {

    /**
     * In software testing, a traceability matrix is used to map requirements to test cases, ensuring that all requirements are covered by corresponding test cases.
     *
     * You are given a list of group SIZES of each test case. For example:
     *
     * testCaseGroupSizes = [1, 2, 3, 3, 3, 2]
     *
     * - Test case num 0 belongs to a group of 1 test cases
     * - Test case num 1 belongs to a group of 2 test cases
     * - Test case num 2 belongs to a group of 3 test cases
     * - Test case num 3 belongs to a group of 3 test cases
     * - etc...
     *
     * Your task is to return a list of groups such that each test case i is in a group of size testCaseGroupSizes[i]:
     *
     * testCasesGroups = [[0], [1, 5], [2, 3, 4]]
     *
     * @param testCaseGroupSizes a list of integers, where each integer represents the size of the group for the corresponding test case
     * @return a list of groups, where each group contains the indices of test cases covering the same set of requirements
     */
    public static List<List<Integer>> groupTestCases(List<Integer> testCaseGroupSizes) {


        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> group = new HashMap<>();



        for (int i = 0; i < testCaseGroupSizes.size(); i++) {

            int size = testCaseGroupSizes.get(i);
            group.putIfAbsent(size, new ArrayList<>());

            group.get(size).add(i);


            if (group.get(size).size() == size) {

                result.add(new ArrayList<>(group.get(size)));
                group.get(size).clear();
            }
        }

        return result;

    }

    public static void main(String[] args) {
        List<Integer> testCaseGroupSizes1 = List.of(1, 2, 3, 3, 3, 2);
        List<List<Integer>> testCaseGroups1 = groupTestCases(testCaseGroupSizes1);
        System.out.println(testCaseGroups1);
    }
}
