package Pac;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[ ] args) throws IOException, URISyntaxException {
        System.out.println("This is the beginning");
        Dialogues.Start insert = new Dialogues.Start();
        insert.Greetings();
    }
}
