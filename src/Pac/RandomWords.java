package Pac;

public class RandomWords {
    static boolean promotions = false;
    static class Cracking{

        public void Getter(){

            Dialogues.Asking question = new Dialogues.Asking();
            promotions = question.Greetings();
            if (promotions = true)
                Wuddup();
            else
                System.out.println("k");
        }
        public void Wuddup(){
            System.out.println("Dab");
            System.out.println("Use other memes, this is just a easter egg");
            GoBack();
        }
        public void Bam(){
            System.out.println("*Gasp* You got me!");
            GoBack();
        }

        public void GoBack(){
            Dialogues.Start insert = new Dialogues.Start();
            insert.Listen();
        }

    }
}
