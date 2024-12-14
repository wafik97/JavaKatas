package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {

        assertEquals("hello world", HelloWorld.helloWorld(), "The helloWorld method should return 'hello world'");
    }
}
