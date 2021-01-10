package chapter6;

import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("Total area is " + area);

        calculator.scanner.close();
    }

    public Rectangle getRoom() {
        System.out.println("Enter length:");
        double length = scanner.nextDouble();

        System.out.println("Enter width:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle r1, Rectangle r2) {
        return r1.calculateArea() + r2.calculateArea();
    }

}
