import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input!");
        } else {
            System.out.println(number * number);
        }
    }
}