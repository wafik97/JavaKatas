package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class NginxLogsParserTest {

    @Test
    public void testParseLog() {



        String logEntry = "122.176.223.47 - - [05/Feb/2024:08:29:40 +0000] " + "\"GET /web-enabled/Enhanced-portal/bifurcated-forecast.js HTTP/1.1\" 200 1684 " +
                "\"-\" \"Opera/9.58 (X11; Linux i686; en-US) Presto/2.12.344 Version/13.00\"";



        Map<String, String> expectedParsedLog = Map.of(
                "client_ip", "122.176.223.47",
                "date", "05/Feb/2024:08:29:40 +0000",
                "http_method", "GET",
                "path", "/web-enabled/Enhanced-portal/bifurcated-forecast.js",
                "http_version", "1.1",
                "status", "200",
                "response_bytes", "1684",
                "user_agent", "Opera/9.58 (X11; Linux i686; en-US) Presto/2.12.344 Version/13.00"
        );


        Map<String, String> parsedLog = NginxLogsParser.parseLog(logEntry);


        assertEquals(expectedParsedLog, parsedLog, "The log was not parsed correctly.");


    }
}
