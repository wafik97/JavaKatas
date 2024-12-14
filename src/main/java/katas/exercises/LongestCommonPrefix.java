package katas.exercises;

import java.util.Arrays;
import java.util.Collection;

public class LongestCommonPrefix {

    /**
     * Finds the longest common prefix in an array of strings.
     *
     * @param strs the array of strings
     * @return the longest common prefix, or an empty string if none exists
     */
    public static String longestCommonPrefix(String[] strs) {
        int len=-1;
        int i=0;
        Arrays.sort(strs);
        len=Math.min(strs[0].length(), strs[strs.length-1].length());

        for( i=0;i<len;i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                break;
            }
        }

        return strs[0].substring(0,i);
    }

    public static void main(String[] args) {
        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        String[] test3 = {"interspecies", "interstellar", "interstate"};
        String[] test4 = {"apple", "apricot", "ape"};

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(test1)); // Output: "fl"
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(test2)); // Output: ""
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(test3)); // Output: "inter"
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(test4)); // Output: "ap"
    }
}
