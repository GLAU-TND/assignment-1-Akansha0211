package execution;


import ContactListApplication.ContactListApplication;

import java.util.Scanner;

public class ContactListAppMain {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactListApplication ca = new ContactListApplication();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    ca.print();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {

    }

    public static void addContact() {

    }

    public static void searchContact() {

    }

    public static void removeContact() {

    }


}
