import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDateTime = scanner.nextLine();
        long hoursToSubtract = scanner.nextLong();
        long minutesToAdd = scanner.nextLong();

        LocalDateTime dateTime = LocalDateTime.parse(inputDateTime);

        dateTime = dateTime.minusHours(hoursToSubtract)
                .plusMinutes(minutesToAdd);

        System.out.println(dateTime);
    }
}