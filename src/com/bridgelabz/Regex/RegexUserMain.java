package com.bridgelabz.Regex;
import java.util.Scanner;

public class RegexUserMain {

    RegexUserRegistration regexUserRegistration = new RegexUserRegistration();
    Scanner scanner = new Scanner(System.in);

    public void choice() {
        while (true) {
            System.out.println("Enter 1 To check First\n"
                    + "Enter 2 To Check Second Name\n"
                    + "Enter 3 To Check EmailId\n"
                    + "Enter 0 To Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                       regexUserRegistration.userFirstName();
                       break;
                case 2 :
                        regexUserRegistration.userLastName();
                        break;
                case 3 :
                        regexUserRegistration.userEmailId();
                        break;
                case 0:
                       System.exit(0);
                       break;
                default:
                    System.out.println("enter the wrong input \n Please enter  the correct input");
                    continue;

            }
        }
    }
    public static void main(String[] args) {

        System.out.println("\n Welcome to the user Registration program by Regex \n");
        RegexUserMain regexUserMain = new RegexUserMain();
        regexUserMain.choice();
        regexUserMain.scanner.close();
    }
}
