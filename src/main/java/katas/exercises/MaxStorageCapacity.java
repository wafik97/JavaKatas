package katas.exercises;

import java.util.Stack;

public class MaxStorageCapacity {

    /**
     *
     * Imagine a series of storage containers placed side by side, where the height of each container
     * is given by an integer in the array. Your task is to find the largest rectangular area that
     * can be formed using one or more of these containers.
     *
     * For example:
     * Input: containers = [2, 1, 5, 6, 2, 3]
     * Output: 10
     * Explanation: The largest rectangle is formed between containers at indices 2 and 3
     * with height 5 and width 2.
     *
     * @param containers an array of integers representing the heights of containers
     * @return the area of the largest rectangle formed between containers
     */
    public static int maxStorageArea(int[] containers) {

        int width;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < containers.length; i++) {
            while (!stack.isEmpty() && containers[stack.peek()] > containers[i]) {
                int height = containers[stack.pop()];
                width = stack.isEmpty() ? i : i - stack.peek() - 1;
                if(maxArea<height * width){
                    maxArea=height * width;
                }
            }
            stack.push(i);
        }



        while (!stack.isEmpty()) {
            int height = containers[stack.pop()];
            if(stack.isEmpty()){
                width=containers.length;
            }
            else {
                width=containers.length - stack.peek() - 1;
            }

            if(maxArea<height * width){
                maxArea=height * width;
            }
        }



        return maxArea;


    }

    public static void main(String[] args) {
        int[] containers = {2, 1, 5, 6, 2, 3};

        int result = maxStorageArea(containers);
        System.out.println("Max storage area: " + result); // Expected output: 10
    }
}
