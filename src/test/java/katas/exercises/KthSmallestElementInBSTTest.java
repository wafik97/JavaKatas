package katas.exercises;

import static org.junit.Assert.*;
import org.junit.Test;

public class KthSmallestElementInBSTTest {

    @Test
    public void testKthSmallest() {

        KthSmallestElementInBST.TreeNode root = new KthSmallestElementInBST.TreeNode(5);


        root.left = new KthSmallestElementInBST.TreeNode(3);
        root.right = new KthSmallestElementInBST.TreeNode(6);
        root.left.left = new KthSmallestElementInBST.TreeNode(2);
        root.left.right = new KthSmallestElementInBST.TreeNode(4);

        assertEquals(2, KthSmallestElementInBST.kthSmallest(root, 1));

        assertEquals(3, KthSmallestElementInBST.kthSmallest(root, 2));
        assertEquals(4, KthSmallestElementInBST.kthSmallest(root, 3));
        assertEquals(5, KthSmallestElementInBST.kthSmallest(root, 4));
        assertEquals(6, KthSmallestElementInBST.kthSmallest(root, 5));
    }

    @Test
    public void testSingleElement() {
        KthSmallestElementInBST.TreeNode root = new KthSmallestElementInBST.TreeNode(10);
        assertEquals(10, KthSmallestElementInBST.kthSmallest(root, 1));
    }
}
