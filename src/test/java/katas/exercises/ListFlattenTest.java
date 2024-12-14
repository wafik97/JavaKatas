package katas.exercises;

import static katas.exercises.ListFlatten.flattenList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class ListFlattenTest {

    @Test
    public void testDoNTimes() {
        List<Object> nestedList = new ArrayList<>();
        nestedList.add(1);
        nestedList.add(List.of(2, 3));
        nestedList.add(List.of(4, List.of(5, 6)));
        nestedList.add(7);
        List<Integer> flatList = flattenList(nestedList);

        assertEquals(1, flatList.get(0), "the number should be 1");
        assertEquals(2, flatList.get(1), "the number should be 2");
        assertEquals(3, flatList.get(2), "the number should be 3");
        assertEquals(4, flatList.get(3), "the number should be 4");
        assertEquals(5, flatList.get(4), "the number should be 5");
        assertEquals(6, flatList.get(5), "the number should be 6");
        assertEquals(7, flatList.get(6), "the number should be 7");
    }
}
