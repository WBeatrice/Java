// Реализовать простой калькулятор

package Homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String sum = "+";
        // String minus = "-";
        // String multiply = "*";
        // String divide = "/";
        int result;

        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = in.nextInt();
        System.out.print("Enter the operation (+, -, * or /): ");
        char operation = in.next().charAt(0);
        
        switch(operation){
            case '+': result = number1 + number2;
                break;
            case '-': result = number1 - number2;
                break;
            case '*': result = number1 * number2;
                break;
            case '/': result = number1 / number2;
                break;
            default: System.out.println("Error! Try again");
                return;
        }
        System.out.printf(number1 + " "+ operation +" "+ number2 +" = "+ result);
    }
}
