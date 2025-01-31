package katas.exercises;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class LagsTest {

    @Test
    public void testMaximizeProfit() {
        List<Lags.Request> requests = new ArrayList<>();
        requests.add(new Lags.Request("REQ01", 0, 5, 50));
        requests.add(new Lags.Request("REQ02", 3, 7, 80));
        requests.add(new Lags.Request("REQ03", 5, 4, 60));
        requests.add(new Lags.Request("REQ04", 6, 3, 70));

        assertEquals(120, Lags.maximizeProfit(requests));
    }

    @Test
    public void testSingleRequest() {
        List<Lags.Request> requests = new ArrayList<>();
        requests.add(new Lags.Request("REQ01", 0, 5, 50));

        assertEquals(50, Lags.maximizeProfit(requests));
    }

    @Test
    public void testNonOverlappingRequests() {
        List<Lags.Request> requests = new ArrayList<>();
        requests.add(new Lags.Request("REQ01", 0, 2, 30));
        requests.add(new Lags.Request("REQ02", 3, 2, 40));
        requests.add(new Lags.Request("REQ03", 6, 2, 50));

        assertEquals(120, Lags.maximizeProfit(requests));
    }

    @Test
    public void testAllOverlappingRequests() {
        List<Lags.Request> requests = new ArrayList<>();
        requests.add(new Lags.Request("REQ01", 0, 5, 50));
        requests.add(new Lags.Request("REQ02", 1, 5, 80));
        requests.add(new Lags.Request("REQ03", 2, 5, 60));

        assertEquals(80, Lags.maximizeProfit(requests));
    }

    @Test
    public void testEmptyList() {
        List<Lags.Request> requests = new ArrayList<>();
        assertEquals(0, Lags.maximizeProfit(requests));
    }
}
