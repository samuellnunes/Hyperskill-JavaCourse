import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int daysFromEnd = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        int lastDay = yearMonth.lengthOfMonth();

        LocalDate date = LocalDate.of(year, month, lastDay - daysFromEnd + 1);
        System.out.println(date);
    }
}