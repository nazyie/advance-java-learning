package io.scannerclass;

import java.util.Scanner;

public class ScannerClassExample {


    public static void main(String[] args) {
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

//        scanner.next();
//        scanner.nextInt();
//        scanner.nextLong();

        System.out.println("Your name is " + name);

    }
}
