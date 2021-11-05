package tests;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;

        System.out.println(
                "Welcome to the Calculator!\n" +
                "Following operations are available:\n" +
                "1 - add\n" +
                "2 - subtract\n" +
                "3 - multiply\n" +
                "4 - power\n" +
                "5 - factorial\n" +
                "anything else stops the program\n"
        );


        while (true) {
            System.out.printf("Value: %d\n", value);
            System.out.print("Select operation: ");
            int op = sc.nextInt();

            if(op > 0 && op < 5) {
                System.out.print("Select 2nd value: ");
                int secondValue = sc.nextInt();
                if (op == 1) value = add(value, secondValue);
                if (op == 2) value = subtract(value, secondValue);
                if (op == 3) value = multiply(value, secondValue);
                if (op == 4) value = power(value, secondValue);
            }
            else if(op == 5) {
                value = factorial(value);
            }
            else {
                break;
            }
        }

        sc.close();
    }

    public static int add(int value, int secondValue) {
        return value + secondValue;
    }

    public static int subtract(int value, int secondValue) {
        return value - secondValue;
    }

    public static int multiply(int value, int secondValue) {
        return value * secondValue;
    }

    public static int power(int value, int secondValue) {
        int result = value;
        for(int i=1; i < secondValue; i++)
            result *= value;
        return result;
    }

    public static int factorial(int value) {
        int result = 1;
        for(int i = 2; i <= value; i++)
            result *= i;
        return result;
    }
}
