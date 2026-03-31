import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LocalDateTime dateTime = LocalDateTime.parse(input);
        LocalDate resultDate = dateTime.plusHours(11).toLocalDate();

        System.out.println(resultDate);
    }
}