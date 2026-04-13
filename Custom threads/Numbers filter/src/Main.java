import java.util.Scanner;

class NumbersFilter extends Thread {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}