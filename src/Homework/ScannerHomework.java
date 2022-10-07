package Homework;

import java.util.Scanner;

public class ScannerHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println("The area of a circle with radius: [" + a + "] is " + (3.14 * a * a));

        System.out.println("What your name?");
        String name = scanner.next();
        System.out.println("Hallo " + name);

        String test = "I study Basic Java!";

        System.out.println(test.charAt(18));
    }




}


