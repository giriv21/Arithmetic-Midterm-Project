/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** 
 * This class calls the method to perform 
 * arithmetic operations using Enum input.
 * Executes the code and prints all results.
 * @author sivagamasrinivasan
 */
public class Arithmetic {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticBase arithmeticBase = new ArithmeticBase();

        // Take numerical inputs
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform and print results for all operations
        for (OperationType operation : OperationType.values()) {
            double result = arithmeticBase.calculate(num1, num2, operation);
            System.out.println(operation + " result: " + result);
        }
    }
}
