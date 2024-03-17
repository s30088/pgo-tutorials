import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        zad1();
    }

    public static void zad1() {
        Scanner scanner = new Scanner(System.in);
        task(scanner);
    }

    public static void task(Scanner scanner) {
        System.out.println("Number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The value equals 0");
        }
    }
}