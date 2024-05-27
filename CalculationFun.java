
import java.util.Scanner;

public class CalculationFun {

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = add(num1, num2);

        System.out.println("The result of addition is: " + result);

        scanner.close();
    }
    public double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        CalculationFun calc = new CalculationFun();
        calc.input();
    }
}