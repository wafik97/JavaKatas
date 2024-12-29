package katas.exercises;

import static katas.exercises.ValidGitTree.isValidGitTree;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ValidGitTreeTest {

    @Test
    public void testValidGitTree() {



        Map<String, List<String>> validTree = new HashMap<>();
        validTree.put("A", List.of("B", "C"));
        validTree.put("B", List.of("D"));
        validTree.put("C", List.of());
        validTree.put("D", List.of());
        assertTrue(isValidGitTree(validTree), "The Git tree should be valid");



        Map<String, List<String>> invalidTree1 = new HashMap<>();
        invalidTree1.put("A", List.of("B"));
        invalidTree1.put("B", List.of("C"));
        invalidTree1.put("C", List.of("A"));
        assertFalse(isValidGitTree(invalidTree1), "The Git tree should be invalid due to a cycle");


        Map<String, List<String>> invalidTree2 = new HashMap<>();
        invalidTree2.put("A", List.of("B"));
        invalidTree2.put("B", List.of("C"));
        invalidTree2.put("D", List.of("E"));
        invalidTree2.put("E", List.of());
        assertFalse(isValidGitTree(invalidTree2), "The Git tree should be invalid due to multiple roots");


        Map<String, List<String>> invalidTree3 = new HashMap<>();
        assertFalse(isValidGitTree(invalidTree3), "The Git tree should be invalid due to no nodes");


        Map<String, List<String>> invalidTree4 = new HashMap<>();
        invalidTree4.put("A", List.of("B"));
        invalidTree4.put("B", List.of());
        invalidTree4.put("C", List.of());
        assertFalse(isValidGitTree(invalidTree4), "The Git tree should be invalid due to disconnected node");
    }
}
