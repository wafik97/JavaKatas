package katas.exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RequirementsCoverage {

    /**
     * In software testing, it's often required to select a minimal set of test cases that cover all the requirements.
     * You are given a set of test cases and their associated covered requirements.
     * Your task is to select the minimal subset of test cases such that all requirements are covered.
     *
     * For example, you have the following test cases and requirements they cover:
     *
     * testCases = [
     *   [1, 2, 3],   // Test case 0 covers requirements 1, 2, 3
     *   [1, 4],      // Test case 1 covers requirements 1, 4
     *   [2, 3, 4],   // Test case 2 covers requirements 2, 3, 4
     *   [1, 5],      // Test case 3 covers requirements 1, 5
     *   [3, 5]       // Test case 4 covers requirements 3, 5
     * ]
     *
     * @param testCases a list of test cases, where each test case is a list of requirements it covers
     * @return a list of indices of the minimal subset of test cases that covers all requirements
     */
    public static List<Integer> selectMinimalTestCases(List<List<Integer>> testCases) {


        Set<Integer> allRequirements = new HashSet<>();
        for (List<Integer> testCase : testCases) {
            allRequirements.addAll(testCase);
        }


        List<Integer> result = new ArrayList<>();
        Set<Integer> covered = new HashSet<>();

        selectMinimalTestCases_aux(testCases, 0, allRequirements, covered, result, new ArrayList<>());

        return result;
    }

    private static void selectMinimalTestCases_aux(List<List<Integer>> testCases, int index, Set<Integer> allRequirements,
                                  Set<Integer> covered, List<Integer> result, List<Integer> current) {


        if (covered.size() == allRequirements.size()) {

            if (result.isEmpty() || current.size() < result.size()) {
                result.clear();

                result.addAll(current);
            }
            return;
        }

        if (index == testCases.size()) {
            return;
        }

        List<Integer> testCase = testCases.get(index);

        Set<Integer> tempCovered = new HashSet<>(covered);
        for (int req : testCase) {
            tempCovered.add(req);
        }

        current.add(index);
        selectMinimalTestCases_aux(testCases, index + 1, allRequirements, tempCovered, result, current);
        current.remove(current.size() - 1);

        selectMinimalTestCases_aux(testCases, index + 1, allRequirements, covered, result, current);
    }

    public static void main(String[] args) {
        List<List<Integer>> testCases = List.of(
                List.of(1, 2, 3),
                List.of(1, 4),
                List.of(2, 3, 4),
                List.of(1, 5),
                List.of(3, 5)
        );

        List<Integer> result = selectMinimalTestCases(testCases);
        System.out.println(result); // Expected output: [2, 3]
    }
}
