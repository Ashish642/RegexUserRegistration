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

       public void userLastName() {
              System.out.println("Enter Your  Last Name : ");
              String lastName = scanner.next();
              userDetails.lastName(lastName);
       }
       public void userEmailId() {
              System.out.println("Enter Your EmailId : ");
              String emailId = scanner.next();
              userDetails.emailId(emailId);
       }
       public void userMobileNumber() {
              System.out.println("Enter your MobileNumber ");
              String mobileNumber = scanner.next();
              userDetails.mobileNumber(mobileNumber);


       }
       public void userPassword() {
              System.out.println("Enter your Password");
              String password = scanner.next();
              userDetails.password(password);
       }


}
