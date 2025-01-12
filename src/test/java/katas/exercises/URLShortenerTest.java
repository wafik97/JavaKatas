

package katas.exercises;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class URLShortenerTest {

    @Test
    public void testURLShortener() {

        URLShortener shortener = new URLShortener();

        String longUrl = "https://www.example.com/some/really/long/url";
        String shortUrl = shortener.shorten(longUrl);
        assertEquals("http://short.ly/a",shortUrl, "the link is wrong");
        assertEquals("https://www.example.com/some/really/long/url",shortener.retrieve(shortUrl), "the link is wrong");

        String longUrl1 = "https://www.example.com/some/really/long6565/url";
        String shortUrl1 = shortener.shorten(longUrl1);
        assertEquals("http://short.ly/b",shortUrl1, "the link is wrong");
        assertEquals("https://www.example.com/some/really/long6565/url",shortener.retrieve(shortUrl1), "the link is wrong");


    }
}


