//import stuff here

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        int num1;
        
        int num2;
        
        
        
        System.out.println("Enter number 1: ");
        System.out.println();
        
        Scanner numberScanner1 = new Scanner(System.in);
        num1 = numberScanner1.nextInt();
        System.out.println();
        
    
        System.out.println("Enter number 2: ");
        System.out.println();

        Scanner numberScanner2 = new Scanner(System.in);
        num2 = numberScanner2.nextInt();
        
        
        Calculator calculate = new Calculator(num1, num2);
        System.out.println();
        System.out.println("The Sum Is:  " + calculate.getSum());
        System.out.println();
        System.out.println("The Difference Is: " + calculate.getDifference());
        System.out.println();
        System.out.println("The Product Is: " + calculate.getProduct());
        System.out.println();
        System.out.println("The Average Is: " + calculate.getAverage());
        System.out.println();
        System.out.println("The Absolute Value Is: " + calculate.getAbsoluteValue());
        System.out.println();
        System.out.println("The Maximum Value Is: " + calculate.getMaximumValue());
        System.out.println();
        System.out.println("The Minimum Value Is: " + calculate.getMinimumValue());
        System.out.println();

        
        
    }
}
//Paste console output below:
/*
Enter number 1: 

13

Enter number 2: 

20

The Sum Is: 33

The Difference Is: -7

The Product Is: 260

The Average Is: 16.5

The Absolute Value Is: 7

The Maximum Value Is: 20

The Minimum Value Is: 13


*/


--------------------------------------------------------------------------------------------------------------------------------

public class Calculator
{
    
    int Sum;
    
    int Difference;
    
    int Product;
    
    double Average;
    
    int AbsoluteValue;
    
    int MaximumValue;
    
    int MinimumValue;

    
    public Calculator(int num1, int num2)
    {
        
        Sum = num1 + num2;
        
        Difference = num1 - num2;
        
        Product = num1 * num2;
        
        Average = (num1 + num2) / 2.0;
        
        AbsoluteValue = Math.abs(num1 - num2);
        
        MaximumValue = (num1 + num2 + AbsoluteValue) / 2;
        
        MinimumValue = (num1 + num2 - AbsoluteValue) / 2;
        
        
    }

    public int getSum() {
    return Sum;
}

    public int getDifference() {
    return Difference;
}

    public int getProduct() {
    return Product;
}

    public double getAverage() {
    return Average;
}

    public int getAbsoluteValue() {
    return AbsoluteValue;
}

    public int getMaximumValue() { 
    return MaximumValue;
}

    public int getMinimumValue() {
    return MinimumValue;
}
    }

