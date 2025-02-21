/*
 * Enum for Arithmetic Operations
 * Avoids String input for better type safety.
 * @author sivagamasrinivasan
 */
package arithmetic;

enum OperationType {
    PLUS, MINUS, TIMES, DIVIDE;

    // Perform calculation directly within the Enum
    public double calculate(double x, double y) {
        switch (this) {
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return y != 0 ? x / y : Double.NaN; 
            default: throw new IllegalArgumentException("Invalid Operation");
        }
    }
}
