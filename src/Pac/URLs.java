package Pac;
import java.io.IOException;
import java.net.URISyntaxException;

public class URLs {
    void open(String url) throws IOException, URISyntaxException {
        var test = new ToBrowse();
        test.ToWeb(url);
    }
    void Rick() throws IOException, URISyntaxException {
        var rick = new ToBrowse();
        rick.ToWeb("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}
