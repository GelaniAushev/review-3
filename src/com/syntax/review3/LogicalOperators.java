package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed = true;
        boolean loginButtonClickable = true;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case is failed");
        }

        System.out.println("----------------------");

        boolean dashboard = false;
        String message = "Welcome Admin";

        if (dashboard || message.equals("Welcome Admin")) {
            System.out.println("User is successfully logged in");
        } else {
            System.out.println("User is not logged in");
        }

        System.out.println("----------------------");

        boolean b = true;

        System.out.println(!true);//false

        boolean agreeCheckBox=true;

        if(!agreeCheckBox){
            System.out.println("I am clicking on checkbox");
        }

        System.out.println("I am clicking on submit button");


    }
}
