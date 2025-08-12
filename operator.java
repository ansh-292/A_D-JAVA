import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.err.println("Addition = " + (a + b));
        System.err.println("Subtraction = " + (a - b));
        System.err.println("multiplication = " + (a * b));
        System.err.println("Division = " + (a / b));
        System.err.println("Modulus = " + (a % b));

    }
    
}
