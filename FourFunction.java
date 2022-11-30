import java.util.Scanner;

public class FourFunction {
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = prompt(scan, "Give me a number ");
        }

        System.out.println("Your sum is " + sum(array));
        System.out.println("Your average is " + avg(array));

        while (true) {
            double x = prompt(scan, "x: ");
            double y = prompt(scan, "y: ");
            System.out.println("Operator: ");
            String op = scan.next();

            if (op.equals("q")) {
                break;
            }

            double result = calculate(x, y, op);
            System.out.println(x + " " + op + " " + y + " = " + result);
        }

    }

    public static double prompt(Scanner scan, String message) {
        System.out.print(message);
        return scan.nextDouble();
    }

    public static double sum(double array[]) {
        double result = 0.0;
        for (int index = 0; index < array.length; index++) {
            result += array[index];
        }
        return result;
    }

    public static double avg(double array[]) {
        return sum(array) / array.length;
    }

    public static double printThenScan(Scanner scan, String prompt) {
        System.out.println(prompt);
        double x = scan.nextDouble();
        return x;
    }

    static double calculate(double x, double y, String operation) {
        if (operation.equals("+")) {
            return (x + y);
        } else if (operation.equals("-")) {
            return (x - y);
        } else if (operation.equals("/")) {
            return (x / y);
        } else if (operation.equals("*")) {
            return (x * y);
        }

        return 0.0;
    }
}
