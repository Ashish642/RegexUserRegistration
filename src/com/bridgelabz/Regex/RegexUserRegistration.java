package com.bridgelabz.Regex;
import java.util.Scanner;

public class RegexUserRegistration {
       Scanner scanner = new Scanner(System.in);
       UserDetails userDetails = new  UserDetails();

       public void userFirstName() {
              System.out.println("Enter Your First Name : ");
              String firstNme = scanner.next();
              userDetails.firstName(firstNme);

       }
}
