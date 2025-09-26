public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

  public double divide(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
    return (double) a / b;
}

public int modulus(int a, int b) {
    if (b == 0) throw new ArithmeticException("Cannot modulus by zero");
    return a % b;
}

}
