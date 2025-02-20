/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/** 
 * This class executes arithmetic operations using Enum.
 * @author sivagamasrinivasan
 */
public class ArithmeticBase {
    // Method to perform the calculation using Enum
    public double calculate(double x, double y, OperationType operation) {
        return operation.calculate(x, y);
    }
}
