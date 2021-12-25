import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number:");
            int numFirst = scanner.nextInt();

            System.out.println("Enter the second number:");
            int numSecond = scanner.nextInt();

            System.out.println("Enter operator (+, -, *, /)");
            String value = scanner.next();

            if (value.equalsIgnoreCase("+")) {
                plus(numFirst, numSecond);
            } else if (value.equalsIgnoreCase("-")) {
                System.out.print("Result:");
                minus(numFirst, numSecond);
            } else if (value.equalsIgnoreCase("*")) {
                multiply(numFirst, numSecond);
            } else if (value.equalsIgnoreCase("/")) {
                divide(numFirst, numSecond);
            }
            System.out.println("Do you want to continue? (Y/N)");
            String end = scanner.next();
            if (end.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static void plus(int a, int b) {
        System.out.println("Result:" + a + b);
    }

    public static void minus(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println("Result:" + a * b);
    }

    public static void divide(int a, int b) {
        System.out.println("Result:" + a / b);
    }
}
