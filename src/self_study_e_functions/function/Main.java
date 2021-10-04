package self_study_e_functions.function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print();
        String name = sc.next();
        print(name);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        print(number1, number2);

        System.out.println();

        System.out.println(add(number1, number2));
        System.out.println(divide(number1, number2));

        sc.close();
    }

    private static int divide(int number1, int number2) {
        return number1 / number2;
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static void print(){
        System.out.print("Please enter name:");
    }

    private static void print(String name){
        System.out.printf("Welcome %s! Please enter two numbers:", name);
    }

    private static void print(int n1, int n2){
        System.out.printf("%d * %d = %d", n1, n2, n1*n2);
    }
}
