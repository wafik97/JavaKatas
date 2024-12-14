package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DoNTimesTest {

    @Test
    public void testDoNTimes() {
        int[] test_number = {0};
        Runnable add_one = () -> test_number[0]+=1;
        DoNTimes.doNTimes(add_one,23);

        assertEquals(23,test_number[0] , "the func should make the array number 23");
    }
}


