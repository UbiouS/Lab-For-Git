package Pac;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Dialogues {
    static class Start implements BasicTalk{
        Scanner in;

        public void Greetings(){
            System.out.println("Hello! How can I help you");
            Listen();
        }

        public void Listen(){
            in = new Scanner(System.in);
            Reply(in.nextLine());
        }

        public void Reply(String reply){
            RandomWords.Cracking meme = new  RandomWords.Cracking();
            switch (reply){
                case "surprise":
                    System.out.println("Pic-a-boo!");
                    Listen();
                    break;
                case "exit":
                    Goobye();
                    break;
                case "bam":
                    meme.Bam();
                default:
                    System.out.println("Sorry, I don't understand");
                    break;
                case "memes":
                    meme.Getter();
                    break;
            }
        }

        public void Goobye(){
            System.out.println("Goodbye");
        }

        public void Execute (){

            Greetings();

        }
    }

    static class Asking{
        Scanner in;
        boolean answer;
        public boolean Greetings() {
            System.out.println("Want some memes?");
            answer = Listen();
            if (answer = true)
                return true;
            else
                return false;
        }

        public boolean Listen(){
            in = new Scanner(System.in);
            boolean repl = Reply(in.nextLine());
            return repl;
        }

        public boolean Reply(String reply){
            if (reply == "y"){
                return true;
            }
            else
                return false;
        }
    }
}
