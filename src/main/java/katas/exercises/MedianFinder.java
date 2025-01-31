package katas.exercises;

import java.util.ArrayList;

/**
 * find the median of a stream of integers.
 *
 * The numbers will be provided one at a time in a dynamic data stream, and after each new number is added,
 * your function should efficiently compute the median of all numbers seen so far.
 *
 * Adding a number: O(log n).
 * Finding the median: O(1) or O(log n).
 *
 * Hint: Consider using two heaps (min-heap and max-heap) to efficiently maintain the order of elements.
 */
public class MedianFinder {

    /**
     * Initializes the MedianFinder object.
     */

    ArrayList<Integer> nums ;


    public MedianFinder() {

        nums = new ArrayList<Integer>();

    }

    /**
     * Adds a number to the data stream.
     *
     * @param num the number to be added
     */
    public void addNum(int num) {

        nums.add(findPlace(num),num);


    }

    public int findPlace(int num) {
        int low = 0, high = nums.size();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums.get(mid) >= num) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }




    /**
     * Finds and returns the median of the data stream.
     *
     * @return the median as a double
     */
    public double findMedian() {
        int mid1,mid2;
        if(nums.size()%2==0){
            mid1= nums.get(nums.size()/2-1);
            mid2= nums.get(nums.size()/2);
            return (double) (mid1 + mid2) /2;
        }
        else{

            return nums.get(nums.size()/2);
        }



    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();

        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println("Median: " + medianFinder.findMedian());

        medianFinder.addNum(3);
        System.out.println("Median: " + medianFinder.findMedian());

        medianFinder.addNum(5);
        System.out.println("Median: " + medianFinder.findMedian());
    }
}
