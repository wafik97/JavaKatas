
package katas.exercises;

import static katas.exercises.ArrayReducer.reduceArray;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OrderedMapTest {

    @Test
    public void testOrderedMap() {


        OrderedMap<String, Integer> orderedMap = new OrderedMap<>();

        orderedMap.put("One", 1);
        orderedMap.put("Two", 2);
        orderedMap.put("Three", 3);


        assertEquals("[One, Two, Three]",  orderedMap.keys().toString());

        assertEquals(2,  orderedMap.get("Two"));


        orderedMap.remove("Two");

        assertEquals("[One, Three]",  orderedMap.keys().toString());

        orderedMap.put("Two", 22);

        assertEquals("[One, Three, Two]",  orderedMap.keys().toString());
        assertEquals(3, orderedMap.size());


        orderedMap.clear();
        assertEquals(0, orderedMap.size());

    }
}



