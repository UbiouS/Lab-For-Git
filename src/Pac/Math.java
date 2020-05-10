package Pac;

import java.util.Scanner;

public class Math {

    public static int plus(){
        System.out.println("Enter First");
        int first = Reader();
        System.out.println("Enter Second");
        int second = Reader();
        return (first+second);
    }
    public static int Reader(){
        Scanner input;
        input = new Scanner(System.in);
        return input.nextInt();
    }
}
