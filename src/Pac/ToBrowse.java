package Pac;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ToBrowse {
    void ToWeb(String webUrl) throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI(webUrl));
    }
}





