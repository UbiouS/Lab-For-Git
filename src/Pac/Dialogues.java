package Pac;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Dialogues {
    static class Start {
        Scanner in;

        public void Greetings() throws IOException, URISyntaxException {
            System.out.println("Hello! How can I help you");
            Reply(Listen());
        }

        public String Listen(){
            in = new Scanner(System.in);
            return in.nextLine();
        }

        public void Reply(String reply) throws IOException, URISyntaxException {
            RandomWords meme = new  RandomWords();
            URLs starter = new URLs();
            switch (reply){
                case "surprise":
                    System.out.println("Pic-a-boo!");
                    Listen();
                    break;

                case "plus":
                    Math.plus();
                    break;

                case "internet":
                    starter.open(Listen());
                    break;

                case "exit":
                    Goobye();
                    break;

                case "rick":
                    starter.Rick();
                    break;

                case "bam":
                    meme.Bam();
                    break;

                case "meme":
                    URLs.Meme();
                    break;

                case "timmy":
                    URLs.Timmy();
                    break;

                case "memes":
                    meme.Getter();
                    break;

                default:
                    System.out.println("Sorry, I don't understand");
                    break;
            }
        }

        public void Goobye(){
            System.out.println("Goodbye");
        }
    }

    static class Asking{
        Scanner in;
        boolean answer;
        public boolean Greetings() {
            System.out.println("Want some memes?");
            answer = Listen();
            return answer = true;
        }

        public boolean Listen(){
            in = new Scanner(System.in);
            return Reply(in.nextLine());
        }

        public boolean Reply(String reply){
            return reply.equals("y");
        }
    }
}
