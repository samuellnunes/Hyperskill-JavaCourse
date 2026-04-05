import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextLine());
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}