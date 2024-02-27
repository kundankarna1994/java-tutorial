class Calculator {

    // We can overload the class method by defining different parameters
    // example below
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int r1 = calculator.add(3, 12);
        int r2 = calculator.add(1, 1, 1);
        double r3 = calculator.add(10.45, 12);
        System.out.println(r2);
        System.out.println(r1);
        System.out.println(r3);
    }
}
