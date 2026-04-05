import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split(",");

        Set<String> uniqueNames = new LinkedHashSet<>();

        for (String name : names) {
            uniqueNames.add(name);
        }

        Iterator<String> iterator = uniqueNames.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(",");
            }
        }
    }
}