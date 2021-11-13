package com.bridgelabz.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

       public String regex;
       public void firstName(String firstName) {
           regex = "^[A-Z]{1}[a-z]{2,}$";
           Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(firstName);
           if (matcher.matches()) {
               System.out.println("Valid");

           }else {
               System.out.println("Invalid");


               }
           }
           public void lastName(String lastName) {
           regex = "^[A-Z]{1}[a-z]{2,}$";
           Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(lastName);
           if (matcher.matches()) {
               System.out.println("Valid");

           }else {
               System.out.println("Invalid");

           }
       }

}
