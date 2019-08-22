package main;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        char b = s.next().charAt(0);
        if (a > b)
            System.out.println(b + " " + a);

        else
            System.out.println(a + " " + b);


    }
}
