package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        /* when we have more conditions to test

        if (boolean conditions){
            code A;
        } else if (boolean conditions) {
            code B;
        } else if (boolean conditions) {
            code C;
        }

        */

        /* Check homework
            if you completed more than 25 -> great job
            if you completed more than >20 -> good job
            if you completed more than >10 -> ok job
            if you completed more than >5 -> not good job
         */

        int homework = 10;

        if (homework > 25) {
            System.out.println("Great Job!!!");
        } else if (homework > 20) {
            System.out.println("Good Job!!");
        } else if (homework > 10) {
            System.out.println("Ok Job!");
        } else if (homework > 5) {
            System.out.println("Not Good Job");
        }

        System.out.println("  ------------------------------------------------------- ");

        String browser = "Chrome";

        if (browser.equals("Chrome")) {
            System.out.println("Test cases executed on Chrome browser");
        } else if (browser.equals("Safari")) {
            System.out.println("Test cases executed on Safari browser");
        } else if (browser.equals("Firefox")) {
            System.out.println("Test cases executed on Firefox browser");
        } else { // when non of the conditions are true, code comes to else block
            System.out.println("Browser is not supported");
        }

    }
}
