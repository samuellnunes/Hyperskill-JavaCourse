import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // stop condition
            if (input.equals("0")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                System.out.println(number * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }
        }
    }
}