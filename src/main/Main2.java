package main;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if ((int) a >= 65 && (int) a <= 122)
            System.out.println("Alphabet");
        else if ((int) a > 127 || (int) a < 65)
            System.out.println("Special character");
        else System.out.println("Digit");
    }
}
