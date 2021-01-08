package chapter2;

import java.util.Scanner;

public class MadLibsExercise {
    public static void main(String[] args) {

        //1. Get season of the year
        System.out.println("Please enter a season");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //2. Get number
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        //3. Get adjective
        System.out.println("Please enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        //Output
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");


    }
}
