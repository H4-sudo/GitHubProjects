import java.util.Scanner;

// Super Class
class Calculator {
    public double calculate(double num1, double num2) {
        return 0;
    }
}

// Class for Adding 2 numbers
class Addition extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

// Class for Subtracting 2 numbers
class Subtraction extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

// Class for Multiplying 2 numbers
class Multiplication extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

// Class for Deviding 2 numbers and 
class Devision extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot devide by 0. Please try again.");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }
}

// Main Class
public class PolymorphicJavaCalculator {
    public static void main(String[] args) {
        Calculator add = new Addition();
        Calculator subtract = new Subtraction();
        Calculator multiply = new Multiplication();
        Calculator devide = new Subtraction();

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        int userChoice;
        double result;

        while (true) {
            System.out.println("Welcome to my Polymorphic cli calculator implementation written in Java.");
            System.out.println("What would you like to do today?\n1. Add\n2. Subtract\n3. Multiply\n4. Devide\n0. Exit");
            userChoice = scanner.nextInt();

            switch (userChoice) {

                // Case for Addition
                case 1:
                    System.out.println("Please enter your first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Please enter your second number:");
                    num2 = scanner.nextDouble();

                    result = add.calculate(num1, num2);
                    System.out.println("Num1: " + num1 + "\nNum2: " + num2 + "\nAdded = " + result);
                    continue;

                // Case for Subtraction
                case 2:
                    System.out.println("Please enter your first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Please enter your second number:");
                    num2 = scanner.nextDouble();
                    
                    result = subtract.calculate(num1, num2);
                    System.out.println("Num1: " + num1 + "\nNum2: " + num2 + "\nSubtracted = " + result);
                    continue;

                // Case for Multiplication
                case 3:
                    System.out.println("Please enter your first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Please enter your second number:");
                    num2 = scanner.nextDouble();

                    result = multiply.calculate(num1, num2);
                    System.out.println("Num1: " + num1 + "\nNum2: " + num2 + "\nMultiplied = " + result);
                    continue;

                // Case for Devision
                case 4:
                    System.out.println("Please enter your first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Please enter your second number:");
                    num2 = scanner.nextDouble();

                    result = devide.calculate(num1, num2);
                    System.out.println("Num1: " + num1 + "\nNum2: " + num2 + "\nDevided = " + result);
                    continue;

                // Case to exit out of the program.
                    case 0:
                    scanner.close();
                    System.exit(userChoice);

                // Continues if there is no correlating option                
                    default:
                        System.out.println("Please choose a valid option.");
                        continue;
            }
        }
    }
}