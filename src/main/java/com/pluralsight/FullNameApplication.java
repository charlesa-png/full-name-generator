package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = myScanner.nextLine();
        System.out.println("Enter your middle name:\n\t(If none, leave blank)");
        String middleName = myScanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = myScanner.nextLine();
        System.out.println("Enter your suffix:\n\t(If none, leave blank)");
        String suffix = myScanner.nextLine();

    }
}
