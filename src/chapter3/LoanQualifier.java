/*
Nested IF
To qualify for  a loan, a person must make at least $30,000.
And have been working at their current job for at least 2 years.
*/

package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't have
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();

        //Make decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for the loan");
            }
            else {
                System.out.println("You must have to work " + requiredYearsEmployed + "years");
            }
        }
        else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
        }
    }
}
