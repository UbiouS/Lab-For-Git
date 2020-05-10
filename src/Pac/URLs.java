package Pac;
import java.io.IOException;
import java.net.URISyntaxException;

public class URLs {
    void open(String url) throws IOException, URISyntaxException {
        ToBrowse.ToWeb(url);
    }
    void Rick() throws IOException, URISyntaxException {
        ToBrowse.ToWeb("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
    static void  Meme() throws IOException, URISyntaxException {
        ToBrowse.ToWeb("https://sun9-9.userapi.com/HKnwW-EG_1ks6qUEVISEP-jRMrwpqMmbkA__2Q/uF8zdjDHJjU.jpg");
    }
    static void Timmy() throws IOException, URISyntaxException {
        ToBrowse.ToWeb("https://sun9-68.userapi.com/OKfuY8-SjupHUoYAZLSSOw9n98YfHGhH_GeX-g/O0hV9yR3As0.jpg");
    }
}
