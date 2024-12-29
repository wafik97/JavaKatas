package katas.exercises;

import static katas.exercises.SemanticVersionComparator.compareVersions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SemanticVersionComparatorTest {

    @Test
    public void testCompareVersions() {


        assertEquals(-1, compareVersions("1.0.0", "1.0.1"), "Version 1.0.0 should be less than 1.0.1");
        assertEquals(1, compareVersions("2.1.0", "1.9.9"), "Version 2.1.0 should be greater than 1.9.9");
        assertEquals(0, compareVersions("1.2.3", "1.2.3"), "Version 1.2.3 should be equal to 1.2.3");
        assertEquals(1, compareVersions("2.0.0", "1.9.9"), "Version 2.0.0 should be greater than 1.9.9");
        assertEquals(-1, compareVersions("1.1.1", "2.0.0"), "Version 1.1.1 should be less than 2.0.0");
        assertEquals(0, compareVersions("1.0.01", "1.0.1"), "Version 1.0.01 should be equal to 1.0.1");
        assertEquals(0, compareVersions("01.02.03", "1.2.3"), "Version 01.02.03 should be equal to 1.2.3");


    }
}
