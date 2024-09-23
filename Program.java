import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        Calculator calculator = new Calculator(num1, num2);
        
        System.out.println("The Sum Is: " + calculator.getSum());
        System.out.println("The Difference Is: " + calculator.getDifference());
        System.out.println("The Product Is: " + calculator.getProduct());
        System.out.println("The Average Is: " + calculator.getAverage());
        System.out.println("The Absolute Value Is: " + calculator.getAbsoluteValue());
        System.out.println("The Maximum Value Is: " + calculator.getMaximumValue());
        System.out.println("The Minimum Value Is: " + calculator.getMinimumValue());
    }
}

class Calculator {
    private int sum;
    private int difference;
    private int product;
    private double average;
    private int absoluteValue;
    private int maximumValue;
    private int minimumValue;

    public Calculator(int num1, int num2) {
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        average = (num1 + num2) / 2.0;
        absoluteValue = Math.abs(num1 - num2);
        maximumValue = Math.max(num1, num2);
        minimumValue = Math.min(num1, num2);
    }

    public int getSum() {
        return sum;
    }

    public int getDifference() {
        return difference;
    }

    public int getProduct() {
        return product;
    }

    public double getAverage() {
        return average;
    }

    public int getAbsoluteValue() {
        return absoluteValue;
    }

    public int getMaximumValue() {
        return maximumValue;
    }

    public int getMinimumValue() {
        return minimumValue;
    }
}
