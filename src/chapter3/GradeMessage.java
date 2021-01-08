package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

        //Get grade
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent!";
                break;
            case "B":
                message = "Good!";
                break;
            case "C":
                message = "Ok!";
                break;
            case "D":
                message = "Work harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Invalid input";
                 break;
        }

        System.out.println(message);
    }
}
