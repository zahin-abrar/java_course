package chapter3;

import java.util.Scanner;

public class DollarChangeExercise {
    public static void main(String[] args) {

        //Declare known values
        int penny = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;
        int dollarInCent = 100;

        //Take user's input
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennyCount = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickelCount = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        int dimeCount = scanner.nextInt();

        System.out.println("How many quarters would you like?");
        int quarterCount = scanner.nextInt();
        scanner.close();

        //Calculating user's total
        int total = (pennyCount*penny) + (nickelCount*nickel) + (dimeCount*dime) + (quarterCount*quarter);

        //Output
        if (total>dollarInCent) {
            int over = total - dollarInCent;
            System.out.println("You went " + over + " cents over!");
        }
        else if (total<dollarInCent) {
            int under = dollarInCent - total;
            System.out.println("You went " + under + " cents under!");
        }
        else {
            System.out.println("Congrats! You win!");
        }

    }
}
