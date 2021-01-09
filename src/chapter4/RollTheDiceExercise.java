package chapter4;

import java.util.Random;

public class RollTheDiceExercise {
    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome Roll the Die! Let's begin...");

        for(int i=1; i<=maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.println("Roll #" + i + ": You have rolled a " + die);

            if(currentSpace == lastSpace) {
                System.out.println("You are on space " + currentSpace + ". Congrats, you win");
                break;
            }

            else if (currentSpace >lastSpace) {
                System.out.println("Unfortunately that takes you past " + lastSpace + " spaces. You loose!");
            }

            else if (i==maxRolls && currentSpace < lastSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " + lastSpace + " spaces. You loose!");
            }

            else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You are on space " + currentSpace + " and have " + spacesToGo + " more to go");
            }

            System.out.println();
        }
    }
}
