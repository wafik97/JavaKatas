package katas.exercises;

import static katas.exercises.ListFlatten.flattenList;
import static katas.exercises.LongestCommonPrefix.longestCommonPrefix;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {

        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "", "car"};
        String[] test3 = {"interspecies", "interstellar", "interstate"};
        String[] test4 = {"apes", "apericot", "ape"};




        assertEquals("fl",longestCommonPrefix(test1),"the answer should be ape");
        assertEquals("", longestCommonPrefix(test2), "the answer should be ape");
        assertEquals("inters", longestCommonPrefix(test3), "the answer should be ape");
        assertEquals("ape", longestCommonPrefix(test4), "the answer should be ape");
    }
}
