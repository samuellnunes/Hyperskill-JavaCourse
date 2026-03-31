import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);

        LocalDate date = LocalDate.of(year, month, 1);

        // move to the first Monday of the month
        while (date.getDayOfWeek() != DayOfWeek.MONDAY) {
            date = date.plusDays(1);
        }

        // print all Mondays of the month
        while (date.getMonthValue() == month) {
            System.out.println(date);
            date = date.plusWeeks(1);
        }
    }
}