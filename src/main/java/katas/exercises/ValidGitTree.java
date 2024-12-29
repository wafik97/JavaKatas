package katas.exercises;

import java.util.*;

public class ValidGitTree {

    /**
     * Determines if a given tree structure represents a valid Git tree.
     *
     * A valid Git tree should:
     * 1. Have exactly one root (no parent).
     * 2. Contain no cycles.
     *
     * @param treeMap a map representing the Git tree (commit ID to list of child commit IDs)
     * @return true if the tree is a valid Git tree, false otherwise
     */
    public static boolean isValidGitTree(Map<String, List<String>> treeMap) {

        Set<String> allNodes = new HashSet<>(treeMap.keySet());
        Set<String> childrenNodes = new HashSet<>();

        for (List<String> children : treeMap.values()) {
            childrenNodes.addAll(children);
        }
        allNodes.removeAll(childrenNodes);
        if (allNodes.size() != 1) {
            return false;
        }
        String root = allNodes.iterator().next();


        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current );
            for (String child : treeMap.getOrDefault(current , Collections.emptyList())) {
                queue.add( child );
            }
        }

        return visited.size() == treeMap.size();


    }

    public static void main(String[] args) {
        Map<String, List<String>> validTree = new HashMap<>();
        validTree.put("A", List.of("B", "C"));
        validTree.put("B", List.of("D"));
        validTree.put("C", List.of());
        validTree.put("D", List.of());

        Map<String, List<String>> invalidTree = new HashMap<>();
        invalidTree.put("A", List.of("B"));
        invalidTree.put("B", List.of("C"));
        invalidTree.put("C", List.of("A")); // cycle

        System.out.println("Is valid tree: " + isValidGitTree(validTree));
        System.out.println("Is valid tree: " + isValidGitTree(invalidTree));
    }
}

